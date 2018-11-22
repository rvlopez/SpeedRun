package speedrun.example.com.speedrun.core.interactor

import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.junit.Before
import org.junit.Test
import speedrun.example.com.speedrun.entity.SpeedRunEntity

class InteractorShould {

    private lateinit var testObserver: TestObserver<SpeedRunEntity>

    @Before fun setUp() {
        testObserver = TestObserver.create()
    }

    @Test
    fun create_subscription_correctly() {
        val observable: Observable<SpeedRunEntity> = Observable.empty()
        observable.subscribe(testObserver)

        testObserver.assertComplete()
        testObserver.assertNoErrors()
        testObserver.assertValueCount(0)
    }

}