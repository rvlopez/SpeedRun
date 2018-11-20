package speedrun.example.com.speedrun.data.datasource.mapper

import speedrun.example.com.speedrun.data.datasource.dto.*
import speedrun.example.com.speedrun.entity.*
import javax.inject.Inject

class RunsDtoMapper @Inject constructor() {

    fun toEntity(runsListDto: RunsListDto): RunsListEntity {
        return RunsListEntity(toRunsEntity(runsListDto.data))
    }

    private fun toRunsEntity(runsListDto: MutableList<RunsDto>): MutableList<RunsEntity> {

        val runsEntityList: MutableList<RunsEntity> = mutableListOf()

        for (runsDto in runsListDto) {
            runsEntityList.add(RunsEntity(
                    runsDto.id,
                    runsDto.game,
                    toVideosEntity(runsDto.videos),
                    toPlayersEntity(runsDto.players),
                    toTimesEntity(runsDto.times)))
        }

        return runsEntityList
    }

    private fun toVideosEntity(videosDto: VideosDto): VideosEntity {
        return VideosEntity(toLinksEntity(videosDto.links))

    }

    private fun toPlayersEntity(playersDto: MutableList<PlayersDto>): MutableList<PlayersEntity> {

        val playersEntityList: MutableList<PlayersEntity> = mutableListOf()

        for (players in playersDto) {
            playersEntityList.add(PlayersEntity(players.rel, players.name, players.uri))
        }

        return playersEntityList
    }

    private fun toTimesEntity(timesDto: TimesDto): TimesEntity {
        return TimesEntity(timesDto.primary, timesDto.primary_t, timesDto.realTime)
    }

    private fun toLinksEntity(linksDto: MutableList<LinksDto>): MutableList<LinksEntity> {

        val linksEntityList: MutableList<LinksEntity> = mutableListOf()

        for (link in linksDto) {
            linksEntityList.add(LinksEntity(link.uri))
        }

        return linksEntityList
    }
}