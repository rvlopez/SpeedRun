package speedrun.example.com.speedrun.data.datasource.dto

import com.google.gson.annotations.SerializedName

data class RuleSetDto(
        @SerializedName("show-milliseconds")
        val showMilliseconds: Boolean,
        @SerializedName("require-verification")
        val requireVerification: Boolean,
        @SerializedName("require-video")
        val requireVideo: Boolean,
        @SerializedName("default-time")
        val defaultTime: String,
        @SerializedName("emulators-allowed")
        val emulatorsAllowed: Boolean

)