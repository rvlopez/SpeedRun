package speedrun.example.com.speedrun.core.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H$J>\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lspeedrun/example/com/speedrun/core/interactor/Interactor;", "T", "", "()V", "disposable", "Lio/reactivex/disposables/Disposable;", "buildObservable", "Lio/reactivex/Observable;", "execute", "", "onNext", "Lkotlin/Function1;", "onError", "", "onComplete", "Lkotlin/Function0;", "unsubscribe", "app_debug"})
public abstract class Interactor<T extends java.lang.Object> {
    private io.reactivex.disposables.Disposable disposable;
    
    public void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onNext, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract io.reactivex.Observable<T> buildObservable();
    
    public final void unsubscribe() {
    }
    
    public Interactor() {
        super();
    }
}