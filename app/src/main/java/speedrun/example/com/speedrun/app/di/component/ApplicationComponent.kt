package speedrun.example.com.speedrun.app.di.component

import dagger.Component
import speedrun.example.com.speedrun.SpeedRunApplication
import speedrun.example.com.speedrun.app.detail.di.component.GamesDetailComponent
import speedrun.example.com.speedrun.app.detail.di.module.GamesDetailModule
import speedrun.example.com.speedrun.app.di.module.ApplicationModule
import speedrun.example.com.speedrun.app.games.di.component.GamesComponent
import speedrun.example.com.speedrun.app.games.di.module.GamesModule
import javax.inject.Singleton

@Singleton @Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: SpeedRunApplication)

    fun plus(gamesModule: GamesModule) : GamesComponent

    fun plus(gamesDetailModule: GamesDetailModule) : GamesDetailComponent

}