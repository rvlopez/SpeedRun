package speedrun.example.com.speedrun.data.datasource

import io.reactivex.Observable
import speedrun.example.com.speedrun.data.datasource.mapper.RunsDtoMapper
import speedrun.example.com.speedrun.data.datasource.mapper.SpeedRunDtoMapper
import speedrun.example.com.speedrun.entity.RunsListEntity
import speedrun.example.com.speedrun.entity.SpeedRunEntity
import javax.inject.Inject

open class SpeedRunDataSource @Inject constructor(
        private val speedRunApi: SpeedRunApi,
        private val speedRunDtoMapper: SpeedRunDtoMapper,
        private val runsDtoMapper: RunsDtoMapper) {

    fun getGames() : Observable<SpeedRunEntity> {
        return speedRunApi.getGames().map(speedRunDtoMapper::toEntity)
    }

    fun getRuns(gameId: String) : Observable<RunsListEntity> {
        return speedRunApi.getRuns(gameId).map(runsDtoMapper::toEntity)
    }
}