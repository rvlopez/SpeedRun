package speedrun.example.com.speedrun.app.games.di.component

import dagger.Subcomponent
import speedrun.example.com.speedrun.app.games.di.module.GamesModule
import speedrun.example.com.speedrun.app.games.view.GameListActivity

@Subcomponent(modules = arrayOf(GamesModule::class))
interface GamesComponent {

    fun inject(activity: GameListActivity)
}