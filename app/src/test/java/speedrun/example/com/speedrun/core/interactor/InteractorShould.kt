package speedrun.example.com.speedrun.core.interactor

import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.junit.Before
import org.junit.Test
import speedrun.example.com.speedrun.entity.SpeedRunEntity
import org.junit.Assert.*
import org.mockito.Mockito
import org.mockito.Mockito.*

class InteractorShould {

    private lateinit var interactor: Interactor<SpeedRunEntity>
    private lateinit var testObserver: TestObserver<SpeedRunEntity>

    private inline fun <reified T: Any> mock() = mock(T::class.java, Mockito.CALLS_REAL_METHODS)

    @Before fun setUp() {
        testObserver = TestObserver.create()
        interactor = mock()
    }

    @Test
    fun create_subscription_correctly() {
        val observable: Observable<SpeedRunEntity> = Observable.empty()
        observable.subscribe(testObserver)

        testObserver.assertComplete()
        testObserver.assertNoErrors()
        testObserver.assertValueCount(0)
    }

    @Test fun interactor_unsubscribe_correctly() {
        //interactor.execute()
        interactor.unsubscribe()

        assertTrue(testObserver.isDisposed)
    }

    @Test fun build_interactor_observable_on_execution() {
        val spyInteractor: Interactor<SpeedRunEntity> = spy(interactor)

        `when`(spyInteractor.buildObservable()).thenReturn(Observable.empty())

        verify(spyInteractor).buildObservable()
    }

}