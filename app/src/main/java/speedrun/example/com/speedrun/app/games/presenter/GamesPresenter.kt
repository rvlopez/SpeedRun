package speedrun.example.com.speedrun.app.games.presenter

import speedrun.example.com.speedrun.app.games.usecase.GamesUseCase
import speedrun.example.com.speedrun.app.games.view.GamesView
import speedrun.example.com.speedrun.core.presenter.Presenter
import javax.inject.Inject

class GamesPresenter @Inject constructor(private val gamesUseCase: GamesUseCase)
    : Presenter<GamesView>() {

    override fun initialize() {
        localView?.showProgress()
        gamesUseCase.execute(
                onNext = { speedRunEntity -> localView?.showGames(speedRunEntity.data) },
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