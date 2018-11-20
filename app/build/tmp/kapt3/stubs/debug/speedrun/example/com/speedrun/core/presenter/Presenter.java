package speedrun.example.com.speedrun.core.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH$J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH&R\u001e\u0010\u0004\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lspeedrun/example/com/speedrun/core/presenter/Presenter;", "V", "", "()V", "localView", "getLocalView", "()Ljava/lang/Object;", "setLocalView", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "initialize", "", "start", "stop", "app_debug"})
public abstract class Presenter<V extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private V localView;
    
    @org.jetbrains.annotations.Nullable()
    public final V getLocalView() {
        return null;
    }
    
    public final void setLocalView(@org.jetbrains.annotations.Nullable()
    V p0) {
    }
    
    public void start() {
    }
    
    protected abstract void initialize();
    
    public abstract void stop();
    
    public Presenter() {
        super();
    }
}