package speedrun.example.com.speedrun.app.detail.usecase

import io.reactivex.Observable
import speedrun.example.com.speedrun.core.interactor.Interactor
import speedrun.example.com.speedrun.data.repository.SpeedRunRepository
import speedrun.example.com.speedrun.entity.RunsListEntity
import javax.inject.Inject

class GamesDetailUseCase @Inject constructor(private val speedRunRepository: SpeedRunRepository) : Interactor<RunsListEntity>() {

    lateinit var gameId: String

    fun execute(id: String, onNext: (RunsListEntity) -> Unit, onError: (Throwable) -> Unit, onComplete: () -> Unit) {
        this.gameId = id
        super.execute(onNext, onError, onComplete)
    }

    override fun buildObservable(): Observable<RunsListEntity> {
        return speedRunRepository.getRuns(gameId)
    }

}