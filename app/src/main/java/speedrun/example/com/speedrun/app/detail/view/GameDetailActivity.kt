package speedrun.example.com.speedrun.app.detail.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_game_detail.*
import kotlinx.android.synthetic.main.progress_bar.*
import kotlinx.android.synthetic.main.show_no_results_layout.*
import kotlinx.android.synthetic.main.toolbar.*
import speedrun.example.com.speedrun.R
import speedrun.example.com.speedrun.SpeedRunApplication
import speedrun.example.com.speedrun.app.detail.di.module.GamesDetailModule
import speedrun.example.com.speedrun.app.detail.presenter.GamesDetailPresenter
import speedrun.example.com.speedrun.core.extensions.hide
import speedrun.example.com.speedrun.core.extensions.show
import speedrun.example.com.speedrun.core.view.RootActivity
import speedrun.example.com.speedrun.entity.SpeedRunGameEntity
import speedrun.example.com.speedrun.entity.RunsListEntity
import javax.inject.Inject

class GameDetailActivity : RootActivity(), GamesDetailView {

    @Inject lateinit var gamesDetailPresenter: GamesDetailPresenter

    private lateinit var runsListEntity: RunsListEntity

    private val Activity.app: SpeedRunApplication get() = application as SpeedRunApplication
    private val component by lazy { app.component.plus(GamesDetailModule()) }

    companion object {
        fun getCallingIntent(context: Context, item: SpeedRunGameEntity): Intent {
            val intent = Intent(context, GameDetailActivity::class.java)
            intent.putExtra(ARG_ITEM, item)
            return intent
        }

        const val ARG_ITEM = "ARG_ITEM"
        const val FIRST = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(mainToolbar)
        getRuns()
    }

    private fun getItem(): SpeedRunGameEntity = intent.getSerializableExtra(ARG_ITEM) as SpeedRunGameEntity

    private fun getRuns() {
        gamesDetailPresenter.start(getItem().id)
    }

    override fun showRuns(runsListEntity: RunsListEntity) {
        val item = getItem()
        this.runsListEntity = runsListEntity
        Glide.with(this).load(item.assets.coverLarge.uri).into(gameLogo)
        playerName.text = String.format(getString(R.string.item_game_player_name),
                runsListEntity.data[FIRST].game)
        runTime.text = String.format(getString(R.string.item_game_time),
                runsListEntity.data[FIRST].times.primary_t)
        gameName.text = String.format(getString(R.string.item_game_name),
                item.names.international)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_game_detail, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
            R.id.openVideo -> openVideoExternal()
            else -> return super.onOptionsItemSelected(item)
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.next_activity_out, R.anim.current_activity_in)
    }

    private fun openVideoExternal() {
        val uri = runsListEntity.data[0].videos.links[0].uri
        if (uri!!.isNotEmpty())
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(uri)))
    }

    override fun showNoResults() {
        detailsLayout.hide()
        noResultsView.show()
    }

    override fun showProgress() = progressBar.show()

    override fun hideProgress() = progressBar.hide()

    override fun showError(throwable: Throwable) {
        noResultsView.text = throwable.message
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_game_detail
    }

    override fun initializeInjector() {
        component.inject(this)
    }

    override fun initializePresenter() {
        gamesDetailPresenter.localView = this@GameDetailActivity
    }
}