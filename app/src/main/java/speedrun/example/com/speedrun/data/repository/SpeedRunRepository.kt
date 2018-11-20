package speedrun.example.com.speedrun.data.repository

import io.reactivex.Observable
import speedrun.example.com.speedrun.entity.RunsEntity
import speedrun.example.com.speedrun.entity.RunsListEntity
import speedrun.example.com.speedrun.entity.SpeedRunEntity

interface SpeedRunRepository {

    fun getGames() : Observable<SpeedRunEntity>

    fun getRuns(gameId: String) : Observable<RunsListEntity>
}