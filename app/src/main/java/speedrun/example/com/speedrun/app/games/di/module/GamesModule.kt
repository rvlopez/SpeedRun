package speedrun.example.com.speedrun.app.games.di.module

import dagger.Module
import dagger.Provides
import speedrun.example.com.speedrun.app.games.presenter.GamesPresenter
import speedrun.example.com.speedrun.app.games.usecase.GamesUseCase
import speedrun.example.com.speedrun.app.games.view.GamesView
import speedrun.example.com.speedrun.core.presenter.Presenter
import speedrun.example.com.speedrun.data.ServiceFactory
import speedrun.example.com.speedrun.data.datasource.SpeedRunApi
import speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource
import speedrun.example.com.speedrun.data.datasource.mapper.RunsDtoMapper
import speedrun.example.com.speedrun.data.datasource.mapper.SpeedRunDtoMapper
import speedrun.example.com.speedrun.data.repository.SpeedRunRepository
import speedrun.example.com.speedrun.data.repository.SpeedRunRepositoryImpl

@Module
class GamesModule {

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
    fun provideGamesUseCase(speedRunRepository: SpeedRunRepository) : GamesUseCase
            = GamesUseCase(speedRunRepository)

    @Provides
    fun provideGamesPresenter(gamesUseCase: GamesUseCase) : Presenter<GamesView>
            = GamesPresenter(gamesUseCase)
}