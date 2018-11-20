package speedrun.example.com.speedrun.data.datasource.dto

data class RunsDto (
        val id: String,
        val game: String,
        val videos: VideosDto,
        val players: MutableList<PlayersDto>,
        val times: TimesDto
)