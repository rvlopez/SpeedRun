package speedrun.example.com.speedrun.core.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class RootActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeInjector()

        val layoutResourceId = getLayoutResourceId()
        if (layoutResourceId > 0) {
            setContentView(layoutResourceId)
        }

        initializePresenter()

    }

    protected abstract fun getLayoutResourceId() : Int

    protected abstract fun initializeInjector()

    protected abstract fun initializePresenter()

}