package speedrun.example.com.speedrun.data.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lspeedrun/example/com/speedrun/data/datasource/SpeedRunDataSource;", "", "speedRunApi", "Lspeedrun/example/com/speedrun/data/datasource/SpeedRunApi;", "speedRunDtoMapper", "Lspeedrun/example/com/speedrun/data/datasource/mapper/SpeedRunDtoMapper;", "runsDtoMapper", "Lspeedrun/example/com/speedrun/data/datasource/mapper/RunsDtoMapper;", "(Lspeedrun/example/com/speedrun/data/datasource/SpeedRunApi;Lspeedrun/example/com/speedrun/data/datasource/mapper/SpeedRunDtoMapper;Lspeedrun/example/com/speedrun/data/datasource/mapper/RunsDtoMapper;)V", "getGames", "Lio/reactivex/Observable;", "Lspeedrun/example/com/speedrun/entity/SpeedRunEntity;", "getRuns", "Lspeedrun/example/com/speedrun/entity/RunsListEntity;", "gameId", "", "app_debug"})
public final class SpeedRunDataSource {
    private final speedrun.example.com.speedrun.data.datasource.SpeedRunApi speedRunApi = null;
    private final speedrun.example.com.speedrun.data.datasource.mapper.SpeedRunDtoMapper speedRunDtoMapper = null;
    private final speedrun.example.com.speedrun.data.datasource.mapper.RunsDtoMapper runsDtoMapper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<speedrun.example.com.speedrun.entity.SpeedRunEntity> getGames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<speedrun.example.com.speedrun.entity.RunsListEntity> getRuns(@org.jetbrains.annotations.NotNull()
    java.lang.String gameId) {
        return null;
    }
    
    @javax.inject.Inject()
    public SpeedRunDataSource(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.SpeedRunApi speedRunApi, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.mapper.SpeedRunDtoMapper speedRunDtoMapper, @org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.data.datasource.mapper.RunsDtoMapper runsDtoMapper) {
        super();
    }
}