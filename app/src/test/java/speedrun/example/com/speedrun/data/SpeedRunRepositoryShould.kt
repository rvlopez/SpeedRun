package speedrun.example.com.speedrun.data

import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource
import speedrun.example.com.speedrun.data.repository.SpeedRunRepository
import speedrun.example.com.speedrun.entity.SpeedRunEntity

class SpeedRunRepositoryShould {

    private lateinit var speedRunDataSource: SpeedRunDataSource
    private lateinit var speedRunRepository: SpeedRunRepository

    private lateinit var testObserver: TestObserver<SpeedRunEntity>

    @Before fun setUp() {
        speedRunDataSource = mock(SpeedRunDataSource::class.java)
        speedRunRepository = mock(SpeedRunRepository::class.java)

        testObserver = TestObserver.create()
    }

    @Test fun get_service_correctly() {
        val speedRunEntity = SpeedRunEntity(mutableListOf())

        `when`(speedRunDataSource.getGames()).thenReturn(Observable.just(speedRunEntity))

        speedRunRepository.getGames().subscribe(testObserver)

        testObserver.awaitTerminalEvent()
        testObserver.assertNoErrors()
        testObserver.assertComplete()
        testObserver.assertValue(speedRunEntity)
    }

}