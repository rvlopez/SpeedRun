package speedrun.example.com.speedrun.app.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lspeedrun/example/com/speedrun/app/di/module/ApplicationModule;", "", "application", "Lspeedrun/example/com/speedrun/SpeedRunApplication;", "(Lspeedrun/example/com/speedrun/SpeedRunApplication;)V", "provideApplication", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final speedrun.example.com.speedrun.SpeedRunApplication application = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final speedrun.example.com.speedrun.SpeedRunApplication provideApplication() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.SpeedRunApplication application) {
        super();
    }
}