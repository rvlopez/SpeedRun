package speedrun.example.com.speedrun.app.detail.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lspeedrun/example/com/speedrun/app/detail/view/GamesDetailView;", "Lspeedrun/example/com/speedrun/core/view/IView;", "hideProgress", "", "showError", "throwable", "", "showNoResults", "showProgress", "showRuns", "runsListEntity", "Lspeedrun/example/com/speedrun/entity/RunsListEntity;", "app_debug"})
public abstract interface GamesDetailView extends speedrun.example.com.speedrun.core.view.IView {
    
    public abstract void showRuns(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.RunsListEntity runsListEntity);
    
    public abstract void showNoResults();
    
    public abstract void showProgress();
    
    public abstract void hideProgress();
    
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable);
}