package speedrun.example.com.speedrun.core.interactor

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.Disposables
import io.reactivex.schedulers.Schedulers

abstract class Interactor<T> {

    private var disposable: Disposable = Disposables.empty()

    open fun execute(onNext: (T) -> Unit, onError: (Throwable) -> Unit, onComplete: () -> Unit) {
        disposable = buildObservable()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(onNext, onError, onComplete)
    }

    abstract fun buildObservable() : Observable<T>

    fun unsubscribe() {
        if (!disposable.isDisposed) {
            disposable.dispose()
        }
    }
}