package speedrun.example.com.speedrun.app.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lspeedrun/example/com/speedrun/app/di/component/ApplicationComponent;", "", "inject", "", "application", "Lspeedrun/example/com/speedrun/SpeedRunApplication;", "plus", "Lspeedrun/example/com/speedrun/app/detail/di/component/GamesDetailComponent;", "gamesDetailModule", "Lspeedrun/example/com/speedrun/app/detail/di/module/GamesDetailModule;", "Lspeedrun/example/com/speedrun/app/games/di/component/GamesComponent;", "gamesModule", "Lspeedrun/example/com/speedrun/app/games/di/module/GamesModule;", "app_debug"})
@dagger.Component(modules = {speedrun.example.com.speedrun.app.di.module.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.SpeedRunApplication application);
    
    @org.jetbrains.annotations.NotNull()
    public abstract speedrun.example.com.speedrun.app.games.di.component.GamesComponent plus(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.games.di.module.GamesModule gamesModule);
    
    @org.jetbrains.annotations.NotNull()
    public abstract speedrun.example.com.speedrun.app.detail.di.component.GamesDetailComponent plus(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.detail.di.module.GamesDetailModule gamesDetailModule);
}