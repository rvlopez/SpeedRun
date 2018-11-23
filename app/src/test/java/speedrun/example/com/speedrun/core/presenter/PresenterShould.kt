package speedrun.example.com.speedrun.core.presenter

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.*
import speedrun.example.com.speedrun.app.games.view.GamesView

class PresenterShould {

    lateinit var view: GamesView
    lateinit var presenter: Presenter<GamesView>

    private inline fun <reified T: Any> mock() = mock(T::class.java, Mockito.CALLS_REAL_METHODS)

    @Before fun setUp() {
        view = mock(GamesView::class.java)
        presenter= mock()
    }

    @Test(expected = IllegalArgumentException::class) fun throw_exception_on_null_view() {

        presenter.localView = null
        presenter.start()
    }

    @Test fun start_correctly_with_valid_mock_presenter() {

        doNothing().`when`(presenter).initialize()

        presenter.localView = view
        presenter.start()

        verify(presenter).initialize()
    }

    @Test fun start_correctly_with_valid_presenter() {
        val presenter: Presenter<GamesView>

    }
}