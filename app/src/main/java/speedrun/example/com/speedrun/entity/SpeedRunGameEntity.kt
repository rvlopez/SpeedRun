package speedrun.example.com.speedrun.entity

import java.io.Serializable

data class SpeedRunGameEntity(
        val id: String,
        val names: GameNamesEntity,
        val abbreviation: String,
        val webLink: String,
        val released: String,
        val releaseDate: String,
        val ruleSet: RuleSetEntity,
        val romHack: Boolean,
        val created: String,
        val assets: AssetsEntity,
        val links: MutableList<LinksEntity>
) : Serializable