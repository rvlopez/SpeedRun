package speedrun.example.com.speedrun.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;", "", "getGames", "Lio/reactivex/Observable;", "Lspeedrun/example/com/speedrun/entity/SpeedRunEntity;", "getRuns", "Lspeedrun/example/com/speedrun/entity/RunsListEntity;", "gameId", "", "app_debug"})
public abstract interface SpeedRunRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<speedrun.example.com.speedrun.entity.SpeedRunEntity> getGames();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<speedrun.example.com.speedrun.entity.RunsListEntity> getRuns(@org.jetbrains.annotations.NotNull()
    java.lang.String gameId);
}