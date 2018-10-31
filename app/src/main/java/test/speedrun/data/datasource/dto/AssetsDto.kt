package test.speedrun.data.datasource.dto

import com.google.gson.annotations.SerializedName

data class AssetsDto (
    val logo: AssetInfoDto,
    @SerializedName("cover-tiny")
    val coverTiny: AssetInfoDto,
    @SerializedName("cover-small")
    val coverSmall: AssetInfoDto,
    @SerializedName("cover-medium")
    val coverMedium: AssetInfoDto,
    @SerializedName("cover-large")
    val coverLarge: AssetInfoDto,
    val icon: AssetInfoDto,
    @SerializedName("trophy-1st")
    val trophyFirst: AssetInfoDto,
    @SerializedName("trophy-2nd")
    val trophySecond: AssetInfoDto,
    @SerializedName("trophy-3rd")
    val trophyThird: AssetInfoDto,
    @SerializedName("trophy-4th")
    val trophyFourth: AssetInfoDto,
    val background: AssetInfoDto,
    val foreground: AssetInfoDto

)