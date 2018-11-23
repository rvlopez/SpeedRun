package speedrun.example.com.speedrun.core.presenter

import speedrun.example.com.speedrun.core.view.IView

abstract class Presenter<V: IView> {

    var localView: V? = null

    open fun start() {
        if (localView == null) {
            throw IllegalArgumentException("Presenter's view can not be null.")
        }

        initialize()
    }

    abstract fun initialize()

    abstract fun stop()

}