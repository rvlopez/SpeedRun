package speedrun.example.com.speedrun.data.datasource.dto

data class RunsDto (
        val id: String,
        val game: String,
        val videos: VideosDto,
        val players: List<PlayersDto>,
        val times: TimesDto
)