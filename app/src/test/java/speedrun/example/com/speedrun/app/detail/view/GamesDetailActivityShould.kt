package speedrun.example.com.speedrun.app.detail.view

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.equalTo
import org.hamcrest.core.IsNull.notNullValue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows
import org.robolectric.shadows.ShadowActivity
import org.robolectric.shadows.ShadowApplication
import speedrun.example.com.speedrun.R
import speedrun.example.com.speedrun.entity.*

@RunWith(RobolectricTestRunner::class)
class GamesDetailActivityShould {

    private lateinit var gameDetailActivity: GameDetailActivity

    @Test
    fun contain_a_single_menu_option() {

        val intent = createFakeIntent()
        gameDetailActivity = Robolectric.buildActivity(GameDetailActivity::class.java, intent)
                .create().visible().get()

        val shadowActivity: ShadowActivity = Shadows.shadowOf(gameDetailActivity)
        val optionMenu: Menu = shadowActivity.optionsMenu

        assertThat(optionMenu, notNullValue())
        assertThat(optionMenu.size(), `is`(equalTo(1)))
    }

    @Test
    fun show_open_video_menu() {

        val intent = createFakeIntent()
        gameDetailActivity = Robolectric.buildActivity(GameDetailActivity::class.java, intent)
                .create().get()

        val shadowActivity = Shadows.shadowOf(gameDetailActivity)
        val optionMenu = shadowActivity.optionsMenu
        val openVideo: MenuItem = optionMenu.findItem(R.id.openVideo)

        assertThat(openVideo, notNullValue())
        assertThat(openVideo.title.toString(), `is`(equalTo("Open video")))
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

    private fun createFakeIntent() : Intent {
        val item = createFakeGames()[0]
        val context = ShadowApplication.getInstance().applicationContext
        return GameDetailActivity.getCallingIntent(context, item)
    }

}