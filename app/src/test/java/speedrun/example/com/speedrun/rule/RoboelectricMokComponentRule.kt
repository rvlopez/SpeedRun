package speedrun.example.com.speedrun.rule

import it.cosenonjaviste.daggermock.DaggerMock
import it.cosenonjaviste.daggermock.DaggerMockRule
import org.robolectric.RuntimeEnvironment
import speedrun.example.com.speedrun.SpeedRunApplication
import speedrun.example.com.speedrun.app.di.component.ApplicationComponent
import speedrun.example.com.speedrun.app.di.module.ApplicationModule

class RoboelectricMokComponentRule {

    fun setRoboelectricMockComponentRule()
            = DaggerMock.rule<ApplicationComponent>(ApplicationModule(SpeedRunApplication())) {
        set { component -> app.component = component }
    }

    private val app : SpeedRunApplication get()
            = RuntimeEnvironment.application as SpeedRunApplication

}