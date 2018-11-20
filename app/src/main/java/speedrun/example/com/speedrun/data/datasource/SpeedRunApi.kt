package speedrun.example.com.speedrun.data.datasource

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query
import speedrun.example.com.speedrun.data.datasource.dto.RunsListDto
import speedrun.example.com.speedrun.data.datasource.dto.SpeedRunListDto

interface SpeedRunApi {

    companion object {
        const val BASE_URL = "https://www.speedrun.com/api/v1/"
        const val GAMES = "games"
        const val RUNS = "runs"
        const val GAME = "game"
    }

    @GET(GAMES)
    fun getGames() : Observable<SpeedRunListDto>

    @GET(RUNS)
    fun getRuns(@Query(GAME) gameId: String) : Observable<RunsListDto>
}