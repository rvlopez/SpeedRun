package speedrun.example.com.speedrun.entity

import java.io.Serializable

data class AssetsInfoEntity(
        val uri: String?,
        val width: Int,
        val height: Int
) : Serializable