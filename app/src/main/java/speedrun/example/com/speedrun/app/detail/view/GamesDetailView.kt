package speedrun.example.com.speedrun.app.detail.view

import speedrun.example.com.speedrun.core.view.IView
import speedrun.example.com.speedrun.entity.RunsListEntity

interface GamesDetailView : IView {

    fun showRuns(runsListEntity: RunsListEntity)

    fun showNoResults()

    fun showProgress()

    fun hideProgress()

    fun showError(throwable: Throwable)
}