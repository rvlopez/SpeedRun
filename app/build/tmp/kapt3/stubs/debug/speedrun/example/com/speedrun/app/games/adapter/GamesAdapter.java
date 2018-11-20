package speedrun.example.com.speedrun.app.games.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/adapter/GamesAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lspeedrun/example/com/speedrun/app/games/adapter/GamesAdapter$ViewHolder;", "onItemClickListener", "Lspeedrun/example/com/speedrun/app/games/adapter/GameItemSelectedListener;", "(Lspeedrun/example/com/speedrun/app/games/adapter/GameItemSelectedListener;)V", "speedRunGames", "", "Lspeedrun/example/com/speedrun/entity/SpeedRunGameEntity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "ViewHolder", "app_debug"})
public final class GamesAdapter extends android.support.v7.widget.RecyclerView.Adapter<speedrun.example.com.speedrun.app.games.adapter.GamesAdapter.ViewHolder> {
    private java.util.List<speedrun.example.com.speedrun.entity.SpeedRunGameEntity> speedRunGames;
    private final speedrun.example.com.speedrun.app.games.adapter.GameItemSelectedListener onItemClickListener = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public speedrun.example.com.speedrun.app.games.adapter.GamesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.games.adapter.GamesAdapter.ViewHolder holder, int position) {
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<speedrun.example.com.speedrun.entity.SpeedRunGameEntity> speedRunGames) {
    }
    
    public GamesAdapter(@org.jetbrains.annotations.NotNull()
    speedrun.example.com.speedrun.app.games.adapter.GameItemSelectedListener onItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lspeedrun/example/com/speedrun/app/games/adapter/GamesAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lspeedrun/example/com/speedrun/entity/SpeedRunGameEntity;", "onItemClickListener", "Lspeedrun/example/com/speedrun/app/games/adapter/GameItemSelectedListener;", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        speedrun.example.com.speedrun.entity.SpeedRunGameEntity item, @org.jetbrains.annotations.NotNull()
        speedrun.example.com.speedrun.app.games.adapter.GameItemSelectedListener onItemClickListener) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}