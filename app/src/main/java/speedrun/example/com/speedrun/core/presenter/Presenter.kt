package speedrun.example.com.speedrun.core.presenter

abstract class Presenter<V> {

    var localView: V? = null

    open fun start() {
        if (localView == null) {
            throw IllegalArgumentException("Presenter's view can not be null.")
        }

        initialize()
    }

    protected abstract fun initialize()

    abstract fun stop()

}