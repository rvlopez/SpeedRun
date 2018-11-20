package speedrun.example.com.speedrun

import android.app.Application
import speedrun.example.com.speedrun.app.di.component.ApplicationComponent
import speedrun.example.com.speedrun.app.di.component.DaggerApplicationComponent
import speedrun.example.com.speedrun.app.di.module.ApplicationModule

class SpeedRunApplication : Application() {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        initializeInjector()
    }

    private fun initializeInjector() {
        component.inject(this)
    }
}