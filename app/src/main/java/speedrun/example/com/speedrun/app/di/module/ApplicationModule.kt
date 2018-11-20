package speedrun.example.com.speedrun.app.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import speedrun.example.com.speedrun.SpeedRunApplication

@Module
class ApplicationModule(private val application: SpeedRunApplication) {

    @Provides @Singleton
    fun provideApplication() = this.application
}