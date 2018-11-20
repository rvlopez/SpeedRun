package speedrun.example.com.speedrun.app.games.view

import speedrun.example.com.speedrun.core.view.IView
import speedrun.example.com.speedrun.entity.SpeedRunGameEntity

interface GamesView : IView {

    fun showGames(speedRunEntityListSpeedRun: MutableList<SpeedRunGameEntity>)

    fun showNoResults()

    fun showProgress()

    fun hideProgress()

    fun showError(throwable: Throwable)
}