package speedrun.example.com.speedrun.app.detail.presenter

import speedrun.example.com.speedrun.app.detail.usecase.GamesDetailUseCase
import speedrun.example.com.speedrun.app.detail.view.GamesDetailView
import speedrun.example.com.speedrun.core.presenter.Presenter

class GamesDetailPresenter(private val gamesUseCase: GamesDetailUseCase)
    : Presenter<GamesDetailView>() {

    lateinit var gameId: String

    fun start(gameId: String) {
        this.gameId = gameId
        super.start()
    }

    override fun initialize() {
        localView?.showProgress()
        gamesUseCase.execute(gameId,
                onNext = { runsEntity -> localView?.showRuns(runsEntity) },
                onError = { throwable ->
                    localView?.hideProgress()
                    localView?.showNoResults()
                    localView?.showError(throwable) },
                onComplete = { localView?.hideProgress() }
        )
    }

    override fun stop() {
        gamesUseCase.unsubscribe()
    }
}