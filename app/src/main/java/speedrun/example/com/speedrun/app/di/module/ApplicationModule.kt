package speedrun.example.com.speedrun.app.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import speedrun.example.com.speedrun.SpeedRunApplication

@Module
open class ApplicationModule(private val application: SpeedRunApplication) {

    @Provides @Singleton
    open fun provideApplication() = this.application
}