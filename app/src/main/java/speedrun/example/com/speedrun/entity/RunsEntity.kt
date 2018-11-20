package speedrun.example.com.speedrun.entity

data class RunsEntity(
        val id: String,
        val game: String,
        val videos: VideosEntity,
        val players: MutableList<PlayersEntity>,
        val times: TimesEntity
)