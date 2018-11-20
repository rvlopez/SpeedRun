package speedrun.example.com.speedrun.entity

import java.io.Serializable

data class GameNamesEntity(
        val international: String,
        val japanese: String?,
        val twitch: String
) : Serializable