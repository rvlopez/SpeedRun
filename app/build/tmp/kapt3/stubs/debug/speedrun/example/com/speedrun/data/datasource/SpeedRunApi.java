package speedrun.example.com.speedrun.data.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\n"}, d2 = {"Lspeedrun/example/com/speedrun/data/datasource/SpeedRunApi;", "", "getGames", "Lio/reactivex/Observable;", "Lspeedrun/example/com/speedrun/data/datasource/dto/SpeedRunListDto;", "getRuns", "Lspeedrun/example/com/speedrun/data/datasource/dto/RunsListDto;", "gameId", "", "Companion", "app_debug"})
public abstract interface SpeedRunApi {
    public static final speedrun.example.com.speedrun.data.datasource.SpeedRunApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://www.speedrun.com/api/v1/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GAMES = "games";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RUNS = "runs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GAME = "game";
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "games")
    public abstract io.reactivex.Observable<speedrun.example.com.speedrun.data.datasource.dto.SpeedRunListDto> getGames();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "runs")
    public abstract io.reactivex.Observable<speedrun.example.com.speedrun.data.datasource.dto.RunsListDto> getRuns(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "game")
    java.lang.String gameId);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lspeedrun/example/com/speedrun/data/datasource/SpeedRunApi$Companion;", "", "()V", "BASE_URL", "", "GAME", "GAMES", "RUNS", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://www.speedrun.com/api/v1/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GAMES = "games";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String RUNS = "runs";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String GAME = "game";
        
        private Companion() {
            super();
        }
    }
}