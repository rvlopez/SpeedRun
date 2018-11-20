package speedrun.example.com.speedrun.app.detail.di.module

import dagger.Module
import dagger.Provides
import speedrun.example.com.speedrun.app.detail.presenter.GamesDetailPresenter
import speedrun.example.com.speedrun.app.detail.usecase.GamesDetailUseCase
import speedrun.example.com.speedrun.app.games.presenter.GamesPresenter
import speedrun.example.com.speedrun.app.games.usecase.GamesUseCase
import speedrun.example.com.speedrun.data.ServiceFactory
import speedrun.example.com.speedrun.data.datasource.SpeedRunApi
import speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource
import speedrun.example.com.speedrun.data.datasource.mapper.RunsDtoMapper
import speedrun.example.com.speedrun.data.datasource.mapper.SpeedRunDtoMapper
import speedrun.example.com.speedrun.data.repository.SpeedRunRepository
import speedrun.example.com.speedrun.data.repository.SpeedRunRepositoryImpl

@Module
class GamesDetailModule {

    @Provides
    fun provideSpeedRunApi() : SpeedRunApi
            = ServiceFactory.createRetrofitService(SpeedRunApi.BASE_URL)

    @Provides
    fun provideSpeedRunDataSource(speedRunApi: SpeedRunApi,
                                  speedRunDtoMapper: SpeedRunDtoMapper,
                                  runsDtoMapper: RunsDtoMapper) : SpeedRunDataSource
            = SpeedRunDataSource(speedRunApi, speedRunDtoMapper, runsDtoMapper)

    @Provides
    fun provideSpeedRunRepository(speedRunDataSource: SpeedRunDataSource) : SpeedRunRepository
            = SpeedRunRepositoryImpl(speedRunDataSource)

    @Provides
    fun provideGameDetailUseCase(speedRunRepository: SpeedRunRepository) : GamesDetailUseCase
            = GamesDetailUseCase(speedRunRepository)

    @Provides
    fun provideGameDetailPresenter(gamesDetailUseCase: GamesDetailUseCase) : GamesDetailPresenter
            = GamesDetailPresenter(gamesDetailUseCase)
}