package speedrun.example.com.speedrun.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepositoryImpl;", "Lspeedrun/example/com/speedrun/data/repository/SpeedRunRepository;", "speedRunDataSource", "Lspeedrun/example/com/speedrun/data/datasource/SpeedRunDataSource;", "(Lspeedrun/example/com/speedrun/data/datasource/SpeedRunDataSource;)V", "getGames", "Lio/reactivex/Observable;", "Lspeedrun/example/com/speedrun/entity/SpeedRunEntity;", "getRuns", "Lspeedrun/example/com/speedrun/entity/RunsListEntity;", "gameId", "", "app_debug"})
public final class SpeedRunRepositoryImpl implements speedrun.example.com.speedrun.data.repository.SpeedRunRepository {
    private final speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource speedRunDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<speedrun.example.com.speedrun.entity.SpeedRunEntity> getGames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<speedrun.example.com.speedrun.entity.RunsListEntity> getRuns(@org.jetbrains.annotations.NotNull()
    java.lang.String gameId) {
        return null;
    }
    
    @javax.inject.Inject()
    public SpeedRunRepositoryImpl(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource speedRunDataSource) {
        super();
    }
}