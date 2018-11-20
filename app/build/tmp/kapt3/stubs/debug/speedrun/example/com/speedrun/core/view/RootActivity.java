package speedrun.example.com.speedrun.core.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H$J\b\u0010\u0005\u001a\u00020\u0006H$J\b\u0010\u0007\u001a\u00020\u0006H$J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014\u00a8\u0006\u000b"}, d2 = {"Lspeedrun/example/com/speedrun/core/view/RootActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "getLayoutResourceId", "", "initializeInjector", "", "initializePresenter", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class RootActivity extends android.support.v7.app.AppCompatActivity {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract int getLayoutResourceId();
    
    protected abstract void initializeInjector();
    
    protected abstract void initializePresenter();
    
    public RootActivity() {
        super();
    }
}