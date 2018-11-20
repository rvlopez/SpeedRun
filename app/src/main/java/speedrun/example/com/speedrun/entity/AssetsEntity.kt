package speedrun.example.com.speedrun.entity

import java.io.Serializable

data class AssetsEntity(
        val logo: AssetsInfoEntity,
        val coverTiny: AssetsInfoEntity,
        val coverSmall: AssetsInfoEntity,
        val coverMedium: AssetsInfoEntity,
        val coverLarge: AssetsInfoEntity,
        val icon: AssetsInfoEntity,
        val trophyFirst: AssetsInfoEntity,
        val trophySecond: AssetsInfoEntity,
        val trophyThird: AssetsInfoEntity,
        val trophyFourth: AssetsInfoEntity,
        val background: AssetsInfoEntity,
        val foreground: AssetsInfoEntity
) : Serializable