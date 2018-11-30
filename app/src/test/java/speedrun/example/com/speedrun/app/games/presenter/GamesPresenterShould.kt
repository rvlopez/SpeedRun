package speedrun.example.com.speedrun.app.games.presenter

import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import speedrun.example.com.speedrun.app.games.usecase.GamesUseCase
import speedrun.example.com.speedrun.app.games.view.GamesView

class GamesPresenterShould {

    @Mock lateinit var mockView: GamesView
    @Mock lateinit var mockGamesUseCase: GamesUseCase
    private lateinit var gamesPresenter: GamesPresenter

    @Before fun setUp() {
        MockitoAnnotations.initMocks(this)

        gamesPresenter = GamesPresenter(mockGamesUseCase)
        gamesPresenter.localView = mockView

    }

    @Test fun unsubscribe_every_use_case_on_stop() {
        gamesPresenter.stop()

        verify(mockGamesUseCase).unsubscribe()
    }

    @Test fun show_progress_on_initialize() {
        gamesPresenter.initialize()

        verify(mockView).showProgress()
    }

    @Test fun show_images_on_initialize_if_has() {


    }

    @Test fun show_no_results_on_complete_without_games() {

    }

}