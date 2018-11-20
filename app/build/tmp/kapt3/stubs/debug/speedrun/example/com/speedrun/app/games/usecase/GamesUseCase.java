package speedrun.example.com.speedrun.app.games.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/usecase/GamesUseCase;", "Lspeedrun/example/com/speedrun/core/interactor/Interactor;", "Lspeedrun/example/com/speedrun/entity/SpeedRunEntity;", "speedRunRepository", "Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;", "(Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;)V", "buildObservable", "Lio/reactivex/Observable;", "app_debug"})
public final class GamesUseCase extends speedrun.example.com.speedrun.core.interactor.Interactor<speedrun.example.com.speedrun.entity.SpeedRunEntity> {
    private final speedrun.example.com.speedrun.data.repository.SpeedRunRepository speedRunRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected io.reactivex.Observable<speedrun.example.com.speedrun.entity.SpeedRunEntity> buildObservable() {
        return null;
    }
    
    @javax.inject.Inject()
    public GamesUseCase(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.repository.SpeedRunRepository speedRunRepository) {
        super();
    }
}