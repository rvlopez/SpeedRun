package speedrun.example.com.speedrun.app.games.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/presenter/GamesPresenter;", "Lspeedrun/example/com/speedrun/core/presenter/Presenter;", "Lspeedrun/example/com/speedrun/app/games/view/GamesView;", "gamesUseCase", "Lspeedrun/example/com/speedrun/app/games/usecase/GamesUseCase;", "(Lspeedrun/example/com/speedrun/app/games/usecase/GamesUseCase;)V", "initialize", "", "stop", "app_debug"})
public final class GamesPresenter extends speedrun.example.com.speedrun.core.presenter.Presenter<speedrun.example.com.speedrun.app.games.view.GamesView> {
    private final speedrun.example.com.speedrun.app.games.usecase.GamesUseCase gamesUseCase = null;
    
    @java.lang.Override()
    protected void initialize() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @javax.inject.Inject()
    public GamesPresenter(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.games.usecase.GamesUseCase gamesUseCase) {
        super();
    }
}