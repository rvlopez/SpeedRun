package speedrun.example.com.speedrun.app.games.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/adapter/GameItemSelectedListener;", "", "onGameItemSelected", "", "speedRunGameItem", "Lspeedrun/example/com/speedrun/entity/SpeedRunGameEntity;", "app_debug"})
public abstract interface GameItemSelectedListener {
    
    public abstract void onGameItemSelected(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.entity.SpeedRunGameEntity speedRunGameItem);
}