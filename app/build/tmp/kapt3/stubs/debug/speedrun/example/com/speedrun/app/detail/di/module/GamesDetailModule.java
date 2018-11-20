package speedrun.example.com.speedrun.app.detail.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\rH\u0007\u00a8\u0006\u0015"}, d2 = {"Lspeedrun/example/com/speedrun/app/detail/di/module/GamesDetailModule;", "", "()V", "provideGameDetailPresenter", "Lspeedrun/example/com/speedrun/app/detail/presenter/GamesDetailPresenter;", "gamesDetailUseCase", "Lspeedrun/example/com/speedrun/app/detail/usecase/GamesDetailUseCase;", "provideGameDetailUseCase", "speedRunRepository", "Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;", "provideSpeedRunApi", "Lspeedrun/example/com/speedrun/data/datasource/SpeedRunApi;", "provideSpeedRunDataSource", "Lspeedrun/example/com/speedrun/data/datasource/SpeedRunDataSource;", "speedRunApi", "speedRunDtoMapper", "Lspeedrun/example/com/speedrun/data/datasource/mapper/SpeedRunDtoMapper;", "runsDtoMapper", "Lspeedrun/example/com/speedrun/data/datasource/mapper/RunsDtoMapper;", "provideSpeedRunRepository", "speedRunDataSource", "app_debug"})
@dagger.Module()
public final class GamesDetailModule {
    
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
    public final speedrun.example.com.speedrun.app.detail.usecase.GamesDetailUseCase provideGameDetailUseCase(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.repository.SpeedRunRepository speedRunRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final speedrun.example.com.speedrun.app.detail.presenter.GamesDetailPresenter provideGameDetailPresenter(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.detail.usecase.GamesDetailUseCase gamesDetailUseCase) {
        return null;
    }
    
    public GamesDetailModule() {
        super();
    }
}