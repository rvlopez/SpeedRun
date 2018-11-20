package speedrun.example.com.speedrun.data.datasource.dto

import com.google.gson.annotations.SerializedName

data class SpeedRunGamesDto(
        val id: String,
        val names: GameNamesDto,
        val abbreviation: String,
        @SerializedName("weblink")
        val webLink: String,
        val released: String,
        @SerializedName("release-date")
        val releaseDate: String,
        @SerializedName("ruleset")
        val ruleSet: RuleSetDto,
        @SerializedName("romhack")
        val romHack: Boolean,
        val created: String,
        val assets: AssetsDto,
        val links: MutableList<LinksDto>

)