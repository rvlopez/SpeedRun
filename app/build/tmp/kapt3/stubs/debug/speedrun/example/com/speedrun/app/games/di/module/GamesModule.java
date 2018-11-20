package speedrun.example.com.speedrun.app.games.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000eH\u0007\u00a8\u0006\u0016"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/di/module/GamesModule;", "", "()V", "provideGamesPresenter", "Lspeedrun/example/com/speedrun/core/presenter/Presenter;", "Lspeedrun/example/com/speedrun/app/games/view/GamesView;", "gamesUseCase", "Lspeedrun/example/com/speedrun/app/games/usecase/GamesUseCase;", "provideGamesUseCase", "speedRunRepository", "Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;", "provideSpeedRunApi", "Lspeedrun/example/com/speedrun/data/datasource/SpeedRunApi;", "provideSpeedRunDataSource", "Lspeedrun/example/com/speedrun/data/datasource/SpeedRunDataSource;", "speedRunApi", "speedRunDtoMapper", "Lspeedrun/example/com/speedrun/data/datasource/mapper/SpeedRunDtoMapper;", "runsDtoMapper", "Lspeedrun/example/com/speedrun/data/datasource/mapper/RunsDtoMapper;", "provideSpeedRunRepository", "speedRunDataSource", "app_debug"})
@dagger.Module()
public final class GamesModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final speedrun.example.com.speedrun.data.datasource.SpeedRunApi provideSpeedRunApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource provideSpeedRunDataSource(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.SpeedRunApi speedRunApi, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.mapper.SpeedRunDtoMapper speedRunDtoMapper, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.mapper.RunsDtoMapper runsDtoMapper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final speedrun.example.com.speedrun.data.repository.SpeedRunRepository provideSpeedRunRepository(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource speedRunDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final speedrun.example.com.speedrun.app.games.usecase.GamesUseCase provideGamesUseCase(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.repository.SpeedRunRepository speedRunRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final speedrun.example.com.speedrun.core.presenter.Presenter<speedrun.example.com.speedrun.app.games.view.GamesView> provideGamesPresenter(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.games.usecase.GamesUseCase gamesUseCase) {
        return null;
    }
    
    public GamesModule() {
        super();
    }
}