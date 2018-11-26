package speedrun.example.com.speedrun.app.games.usecase

import io.reactivex.Observable
import org.junit.Test
import org.mockito.Mockito.*
import speedrun.example.com.speedrun.data.repository.SpeedRunRepository

class GamesUseCaseShould {

    @Test fun call_repository_to_get_games() {
        val speedRunRepository = mock(SpeedRunRepository::class.java)

        `when`(speedRunRepository.getGames()).thenReturn(Observable.empty())

        val useCase = GamesUseCase(speedRunRepository)
        useCase.execute(onNext = {}, onError = {}, onComplete = {})

        verify(speedRunRepository).getGames()
    }
}