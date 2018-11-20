package speedrun.example.com.speedrun.app.detail.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014JD\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000f0\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lspeedrun/example/com/speedrun/app/detail/usecase/GamesDetailUseCase;", "Lspeedrun/example/com/speedrun/core/interactor/Interactor;", "Lspeedrun/example/com/speedrun/entity/RunsListEntity;", "speedRunRepository", "Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;", "(Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;)V", "gameId", "", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "buildObservable", "Lio/reactivex/Observable;", "execute", "", "id", "onNext", "Lkotlin/Function1;", "onError", "", "onComplete", "Lkotlin/Function0;", "app_debug"})
public final class GamesDetailUseCase extends speedrun.example.com.speedrun.core.interactor.Interactor<speedrun.example.com.speedrun.entity.RunsListEntity> {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String gameId;
    private final speedrun.example.com.speedrun.data.repository.SpeedRunRepository speedRunRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGameId() {
        return null;
    }
    
    public final void setGameId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super speedrun.example.com.speedrun.entity.RunsListEntity, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected io.reactivex.Observable<speedrun.example.com.speedrun.entity.RunsListEntity> buildObservable() {
        return null;
    }
    
    @javax.inject.Inject()
    public GamesDetailUseCase(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.repository.SpeedRunRepository speedRunRepository) {
        super();
    }
}