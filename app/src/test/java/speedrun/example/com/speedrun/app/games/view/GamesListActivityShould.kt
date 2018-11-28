package speedrun.example.com.speedrun.app.games.view

import android.view.View
import kotlinx.android.synthetic.main.activity_game_list.*
import kotlinx.android.synthetic.main.progress_bar.*
import kotlinx.android.synthetic.main.show_no_results_layout.*
import org.hamcrest.Matchers.`is`
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Assert.assertThat
import org.mockito.Matchers
import org.mockito.Mockito.*
import speedrun.example.com.speedrun.app.games.presenter.GamesPresenter
import speedrun.example.com.speedrun.entity.*
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class GamesListActivityShould {

    private lateinit var mockPresenter: GamesPresenter
    private lateinit var gameListActivity: GameListActivity

    @Test
    fun set_view_to_presenter() {

        gameListActivity = Robolectric.setupActivity(GameListActivity::class.java)
        mockPresenter = mock(GamesPresenter::class.java)

        verify(mockPresenter).localView = Matchers.eq(gameListActivity)
    }

    @Test
    fun show_games_correctly() {
        val speedRunGameList: List<SpeedRunGameEntity> = createFakeGames()

        gameListActivity = Robolectric.setupActivity(GameListActivity::class.java)
        gameListActivity.showGames(speedRunGameList)

        val progress = gameListActivity.progressBar
        val recycleView = gameListActivity.recyclerView
        val feedback = gameListActivity.noResultsView

        assertThat(progress.visibility, `is`(View.GONE))
        assertThat(recycleView.visibility, `is`(View.VISIBLE))
        assertThat(feedback.visibility, `is`(View.GONE))
    }


    private fun createFakeGames(): List<SpeedRunGameEntity> {

        val speedRunGameEntityList = mutableListOf<SpeedRunGameEntity>()
        speedRunGameEntityList.add(SpeedRunGameEntity(
                "fakeId",
                GameNamesEntity("fakeInternational",
                        "fakeJapanese",
                        "fakeTwitch"),
                "fakeAbbreviation",
                "fakeWebLink",
                "fakeReleased",
                "fakeReleaseDate",
                RuleSetEntity(false,
                        false,
                        false,
                        "fakeDefaultTime",
                        false),
                false,
                "fakeCreated",
                AssetsEntity(AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0),
                        AssetsInfoEntity("fakeUri", 0, 0)
                ),
                listOf()
        ))

        return speedRunGameEntityList
    }
}