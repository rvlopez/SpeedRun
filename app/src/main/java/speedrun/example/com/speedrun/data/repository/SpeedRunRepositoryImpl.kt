package speedrun.example.com.speedrun.data.repository

import io.reactivex.Observable
import speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource
import speedrun.example.com.speedrun.entity.RunsEntity
import speedrun.example.com.speedrun.entity.RunsListEntity
import speedrun.example.com.speedrun.entity.SpeedRunEntity
import javax.inject.Inject

class SpeedRunRepositoryImpl @Inject constructor(private val speedRunDataSource: SpeedRunDataSource)
    : SpeedRunRepository {

    override fun getGames(): Observable<SpeedRunEntity> {
        return speedRunDataSource.getGames()
    }

    override fun getRuns(gameId: String): Observable<RunsListEntity> {
        return speedRunDataSource.getRuns(gameId)
    }

}