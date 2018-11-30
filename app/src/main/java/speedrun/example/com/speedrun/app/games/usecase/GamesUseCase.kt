package speedrun.example.com.speedrun.app.games.usecase

import io.reactivex.Observable
import speedrun.example.com.speedrun.core.interactor.Interactor
import speedrun.example.com.speedrun.data.repository.SpeedRunRepository
import speedrun.example.com.speedrun.entity.SpeedRunEntity
import javax.inject.Inject

open class GamesUseCase @Inject constructor(private val speedRunRepository: SpeedRunRepository)
    : Interactor<SpeedRunEntity>() {

    override fun buildObservable(): Observable<SpeedRunEntity> {
        return speedRunRepository.getGames()
    }

}