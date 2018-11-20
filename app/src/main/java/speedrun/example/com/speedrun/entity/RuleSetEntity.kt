package speedrun.example.com.speedrun.entity

import java.io.Serializable

data class RuleSetEntity(
        val showMilliseconds: Boolean,
        val requireVerification: Boolean,
        val requireVideo: Boolean,
        val defaultTime: String,
        val emulatorsAllowed: Boolean
) : Serializable