package speedrun.example.com.speedrun.app.games.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/view/GamesView;", "Lspeedrun/example/com/speedrun/core/view/IView;", "hideProgress", "", "showError", "throwable", "", "showGames", "speedRunEntityListSpeedRun", "", "Lspeedrun/example/com/speedrun/entity/SpeedRunGameEntity;", "showNoResults", "showProgress", "app_debug"})
public abstract interface GamesView extends speedrun.example.com.speedrun.core.view.IView {
    
    public abstract void showGames(@org.jetbrains.annotations.NotNull()
    java.util.List<speedrun.example.com.speedrun.entity.SpeedRunGameEntity> speedRunEntityListSpeedRun);
    
    public abstract void showNoResults();
    
    public abstract void showProgress();
    
    public abstract void hideProgress();
    
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable);
}