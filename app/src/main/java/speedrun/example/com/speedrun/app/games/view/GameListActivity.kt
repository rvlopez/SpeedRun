package speedrun.example.com.speedrun.app.games.view

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_game_list.*
import kotlinx.android.synthetic.main.progress_bar.*
import kotlinx.android.synthetic.main.show_no_results_layout.*
import speedrun.example.com.speedrun.R
import speedrun.example.com.speedrun.SpeedRunApplication
import speedrun.example.com.speedrun.app.detail.view.GameDetailActivity
import speedrun.example.com.speedrun.app.games.adapter.GameItemSelectedListener
import speedrun.example.com.speedrun.app.games.adapter.GamesAdapter
import speedrun.example.com.speedrun.app.games.di.module.GamesModule
import speedrun.example.com.speedrun.core.extensions.hide
import speedrun.example.com.speedrun.core.extensions.show
import speedrun.example.com.speedrun.core.presenter.Presenter
import speedrun.example.com.speedrun.core.view.RootActivity
import speedrun.example.com.speedrun.entity.SpeedRunGameEntity
import javax.inject.Inject

class GameListActivity : RootActivity(), GamesView, GameItemSelectedListener {

    @Inject lateinit var gamesPresenter: Presenter<GamesView>
    private lateinit var gamesAdapter: GamesAdapter

    private val Activity.app: SpeedRunApplication get() = application as SpeedRunApplication
    private val component by lazy { app.component.plus(GamesModule()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeRecycler()

        gamesPresenter.start()
    }

    private fun initializeRecycler() {
        with(recyclerView) {
            adapter = GamesAdapter(this@GameListActivity)
            layoutManager = LinearLayoutManager(this@GameListActivity)
        }
        gamesAdapter = recyclerView.adapter as GamesAdapter
    }

    override fun onDestroy() {
        super.onDestroy()

        gamesPresenter.stop()
    }

    override fun showGames(speedRunEntityList: List<SpeedRunGameEntity>) {
        recyclerView.show()
        noResultsView.hide()
        gamesAdapter.setItems(speedRunEntityList)

    }

    override fun showNoResults() {
        recyclerView.hide()
        noResultsView.show()
    }

    override fun showProgress() = progressBar.show()

    override fun hideProgress() = progressBar.hide()

    override fun showError(throwable: Throwable) {
        noResultsView.text = throwable.message
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_game_list
    }

    override fun initializeInjector() {
        component.inject(this)
    }

    override fun initializePresenter() {
        gamesPresenter.localView = this@GameListActivity
    }

    override fun onGameItemSelected(speedRunGameItem: SpeedRunGameEntity) {
        startActivity(GameDetailActivity.getCallingIntent(this, speedRunGameItem))
        overridePendingTransition(R.anim.next_activity_in, R.anim.current_activity_out)
    }

}
