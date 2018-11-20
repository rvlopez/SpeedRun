package speedrun.example.com.speedrun.app.detail.di.component

import dagger.Subcomponent
import speedrun.example.com.speedrun.app.detail.di.module.GamesDetailModule
import speedrun.example.com.speedrun.app.detail.view.GameDetailActivity

@Subcomponent(modules = arrayOf(GamesDetailModule::class))
interface GamesDetailComponent {

    fun inject(activity: GameDetailActivity)
}