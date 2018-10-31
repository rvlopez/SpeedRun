package test.speedrun.data.datasource

import retrofit2.http.GET
import rx.Observable
import test.speedrun.data.datasource.dto.SpeedRunResponseDto

interface SpeedRunApi {

    companion object {
        const val BASE_URL = "https://www.speedrun.com/api/v1/"
        const val GAMES = "games"
    }

    @GET(GAMES)
    fun getGames() : Observable<SpeedRunResponseDto>
}