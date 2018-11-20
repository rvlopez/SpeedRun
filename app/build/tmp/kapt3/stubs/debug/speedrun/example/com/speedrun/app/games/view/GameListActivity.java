package speedrun.example.com.speedrun.app.games.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\b\u0010\u001b\u001a\u00020\u0019H\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0019H\u0014J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020&H\u0016J\u0016\u0010\'\u001a\u00020\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020#0)H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\b\u0010+\u001a\u00020\u0019H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/view/GameListActivity;", "Lspeedrun/example/com/speedrun/core/view/RootActivity;", "Lspeedrun/example/com/speedrun/app/games/view/GamesView;", "Lspeedrun/example/com/speedrun/app/games/adapter/GameItemSelectedListener;", "()V", "component", "Lspeedrun/example/com/speedrun/app/games/di/component/GamesComponent;", "getComponent", "()Lspeedrun/example/com/speedrun/app/games/di/component/GamesComponent;", "component$delegate", "Lkotlin/Lazy;", "gamesPresenter", "Lspeedrun/example/com/speedrun/core/presenter/Presenter;", "getGamesPresenter", "()Lspeedrun/example/com/speedrun/core/presenter/Presenter;", "setGamesPresenter", "(Lspeedrun/example/com/speedrun/core/presenter/Presenter;)V", "app", "Lspeedrun/example/com/speedrun/SpeedRunApplication;", "Landroid/app/Activity;", "getApp", "(Landroid/app/Activity;)Lspeedrun/example/com/speedrun/SpeedRunApplication;", "getLayoutResourceId", "", "hideProgress", "", "initializeInjector", "initializePresenter", "initializeRecycler", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGameItemSelected", "speedRunGameItem", "Lspeedrun/example/com/speedrun/entity/SpeedRunGameEntity;", "showError", "throwable", "", "showGames", "speedRunEntityListSpeedRun", "", "showNoResults", "showProgress", "app_debug"})
public final class GameListActivity extends speedrun.example.com.speedrun.core.view.RootActivity implements speedrun.example.com.speedrun.app.games.view.GamesView, speedrun.example.com.speedrun.app.games.adapter.GameItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public speedrun.example.com.speedrun.core.presenter.Presenter<speedrun.example.com.speedrun.app.games.view.GamesView> gamesPresenter;
    private final kotlin.Lazy component$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.core.presenter.Presenter<speedrun.example.com.speedrun.app.games.view.GamesView> getGamesPresenter() {
        return null;
    }
    
    public final void setGamesPresenter(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.core.presenter.Presenter<speedrun.example.com.speedrun.app.games.view.GamesView> p0) {
    }
    
    private final speedrun.example.com.speedrun.SpeedRunApplication getApp(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver) {
        return null;
    }
    
    private final speedrun.example.com.speedrun.app.games.di.component.GamesComponent getComponent() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initializeRecycler() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void showGames(@org.jetbrains.annotations.NotNull()
    java.util.List<speedrun.example.com.speedrun.entity.SpeedRunGameEntity> speedRunEntityListSpeedRun) {
    }
    
    @java.lang.Override()
    public void showNoResults() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    protected int getLayoutResourceId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void initializeInjector() {
    }
    
    @java.lang.Override()
    protected void initializePresenter() {
    }
    
    @java.lang.Override()
    public void onGameItemSelected(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.SpeedRunGameEntity speedRunGameItem) {
    }
    
    public GameListActivity() {
        super();
    }
}