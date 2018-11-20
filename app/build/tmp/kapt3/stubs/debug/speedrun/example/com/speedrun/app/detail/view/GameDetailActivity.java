package speedrun.example.com.speedrun.app.detail.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0014J\b\u0010\u001f\u001a\u00020\u001cH\u0014J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001cH\u0016J\b\u0010/\u001a\u00020\u001cH\u0016J\u0010\u00100\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00062"}, d2 = {"Lspeedrun/example/com/speedrun/app/detail/view/GameDetailActivity;", "Lspeedrun/example/com/speedrun/core/view/RootActivity;", "Lspeedrun/example/com/speedrun/app/detail/view/GamesDetailView;", "()V", "component", "Lspeedrun/example/com/speedrun/app/detail/di/component/GamesDetailComponent;", "getComponent", "()Lspeedrun/example/com/speedrun/app/detail/di/component/GamesDetailComponent;", "component$delegate", "Lkotlin/Lazy;", "gamesDetailPresenter", "Lspeedrun/example/com/speedrun/app/detail/presenter/GamesDetailPresenter;", "getGamesDetailPresenter", "()Lspeedrun/example/com/speedrun/app/detail/presenter/GamesDetailPresenter;", "setGamesDetailPresenter", "(Lspeedrun/example/com/speedrun/app/detail/presenter/GamesDetailPresenter;)V", "runsListEntity", "Lspeedrun/example/com/speedrun/entity/RunsListEntity;", "app", "Lspeedrun/example/com/speedrun/SpeedRunApplication;", "Landroid/app/Activity;", "getApp", "(Landroid/app/Activity;)Lspeedrun/example/com/speedrun/SpeedRunApplication;", "getItem", "Lspeedrun/example/com/speedrun/entity/SpeedRunGameEntity;", "getLayoutResourceId", "", "getRuns", "", "hideProgress", "initializeInjector", "initializePresenter", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openVideoExternal", "showError", "throwable", "", "showNoResults", "showProgress", "showRuns", "Companion", "app_debug"})
public final class GameDetailActivity extends speedrun.example.com.speedrun.core.view.RootActivity implements speedrun.example.com.speedrun.app.detail.view.GamesDetailView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public speedrun.example.com.speedrun.app.detail.presenter.GamesDetailPresenter gamesDetailPresenter;
    private speedrun.example.com.speedrun.entity.RunsListEntity runsListEntity;
    private final kotlin.Lazy component$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ITEM = "ARG_ITEM";
    public static final int FIRST = 0;
    public static final speedrun.example.com.speedrun.app.detail.view.GameDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final speedrun.example.com.speedrun.app.detail.presenter.GamesDetailPresenter getGamesDetailPresenter() {
        return null;
    }
    
    public final void setGamesDetailPresenter(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.detail.presenter.GamesDetailPresenter p0) {
    }
    
    private final speedrun.example.com.speedrun.SpeedRunApplication getApp(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver) {
        return null;
    }
    
    private final speedrun.example.com.speedrun.app.detail.di.component.GamesDetailComponent getComponent() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final speedrun.example.com.speedrun.entity.SpeedRunGameEntity getItem() {
        return null;
    }
    
    private final void getRuns() {
    }
    
    @java.lang.Override()
    public void showRuns(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.RunsListEntity runsListEntity) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void openVideoExternal() {
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
    
    public GameDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lspeedrun/example/com/speedrun/app/detail/view/GameDetailActivity$Companion;", "", "()V", "ARG_ITEM", "", "FIRST", "", "getCallingIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "item", "Lspeedrun/example/com/speedrun/entity/SpeedRunGameEntity;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getCallingIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        speedrun.example.com.speedrun.entity.SpeedRunGameEntity item) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}