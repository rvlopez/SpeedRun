package speedrun.example.com.speedrun.app.detail.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\u000f\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lspeedrun/example/com/speedrun/app/detail/presenter/GamesDetailPresenter;", "Lspeedrun/example/com/speedrun/core/presenter/Presenter;", "Lspeedrun/example/com/speedrun/app/detail/view/GamesDetailView;", "gamesUseCase", "Lspeedrun/example/com/speedrun/app/detail/usecase/GamesDetailUseCase;", "(Lspeedrun/example/com/speedrun/app/detail/usecase/GamesDetailUseCase;)V", "gameId", "", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "initialize", "", "start", "stop", "app_debug"})
public final class GamesDetailPresenter extends speedrun.example.com.speedrun.core.presenter.Presenter<speedrun.example.com.speedrun.app.detail.view.GamesDetailView> {
    @org.jetbrains.annotations.NotNull()
    public java.lang.String gameId;
    private final speedrun.example.com.speedrun.app.detail.usecase.GamesDetailUseCase gamesUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGameId() {
        return null;
    }
    
    public final void setGameId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    java.lang.String gameId) {
    }
    
    @java.lang.Override()
    protected void initialize() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    public GamesDetailPresenter(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.detail.usecase.GamesDetailUseCase gamesUseCase) {
        super();
    }
}