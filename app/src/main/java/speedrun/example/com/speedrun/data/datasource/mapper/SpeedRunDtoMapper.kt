package speedrun.example.com.speedrun.data.datasource.mapper

import speedrun.example.com.speedrun.data.datasource.dto.*
import speedrun.example.com.speedrun.entity.*
import javax.inject.Inject

class SpeedRunDtoMapper @Inject constructor() {

    fun toEntity(speedRunListDto: SpeedRunListDto): SpeedRunEntity {
        return SpeedRunEntity(toGameEntity(speedRunListDto.data))
    }

    private fun toGameEntity(speedRunGamesDto: List<SpeedRunGamesDto>): List<SpeedRunGameEntity> {

        val speedRunGameEntityList: MutableList<SpeedRunGameEntity> = mutableListOf()

        for (speedRunGames in speedRunGamesDto) {
            speedRunGameEntityList.add(SpeedRunGameEntity(
                    speedRunGames.id,
                    toGameNamesEntity(speedRunGames.names),
                    speedRunGames.abbreviation,
                    speedRunGames.webLink,
                    speedRunGames.released,
                    speedRunGames.releaseDate,
                    toRuleSetEntity(speedRunGames.ruleSet),
                    speedRunGames.romHack,
                    speedRunGames.created,
                    toAssetsEntity(speedRunGames.assets),
                    toLinkEntity(speedRunGames.links)))
        }

        return speedRunGameEntityList
    }

    private fun toGameNamesEntity(gameNamesDto: GameNamesDto): GameNamesEntity {
        return GameNamesEntity(gameNamesDto.international, gameNamesDto.japanese, gameNamesDto.twitch)
    }

    private fun toRuleSetEntity(ruleSetDto: RuleSetDto): RuleSetEntity {
        return RuleSetEntity(ruleSetDto.showMilliseconds,
                ruleSetDto.requireVerification,
                ruleSetDto.requireVideo,
                ruleSetDto.defaultTime,
                ruleSetDto.emulatorsAllowed)
    }

    private fun toAssetsEntity(assetsDto: AssetsDto): AssetsEntity {
        return AssetsEntity(toAssetsInfoEntity(assetsDto.logo),
                toAssetsInfoEntity(assetsDto.coverTiny),
                toAssetsInfoEntity(assetsDto.coverSmall),
                toAssetsInfoEntity(assetsDto.coverMedium),
                toAssetsInfoEntity(assetsDto.coverLarge),
                toAssetsInfoEntity(assetsDto.icon),
                toAssetsInfoEntity(assetsDto.trophyFirst),
                toAssetsInfoEntity(assetsDto.trophySecond),
                toAssetsInfoEntity(assetsDto.trophyThird),
                toAssetsInfoEntity(assetsDto.trophyFourth),
                toAssetsInfoEntity(assetsDto.background),
                toAssetsInfoEntity(assetsDto.foreground))
    }

    private fun toLinkEntity(linksDto: List<LinksDto>): List<LinksEntity> {

        val linksEntityList: MutableList<LinksEntity> = mutableListOf()

        for (link in linksDto) {
            linksEntityList.add(LinksEntity(link.uri))
        }

        return linksEntityList
    }

    private fun toAssetsInfoEntity(assetsInfoDto: AssetInfoDto?): AssetsInfoEntity {
        if (assetsInfoDto != null) {
            return AssetsInfoEntity(assetsInfoDto.uri, assetsInfoDto.width, assetsInfoDto.height)
        }

        return AssetsInfoEntity("", 0, 0)
    }
}