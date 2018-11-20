// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package speedrun.example.com.speedrun.app.games.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import speedrun.example.com.speedrun.data.datasource.SpeedRunApi;

public final class GamesModule_ProvideSpeedRunApiFactory implements Factory<SpeedRunApi> {
  private final GamesModule module;

  public GamesModule_ProvideSpeedRunApiFactory(GamesModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SpeedRunApi get() {
    return Preconditions.checkNotNull(
        module.provideSpeedRunApi(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SpeedRunApi> create(GamesModule module) {
    return new GamesModule_ProvideSpeedRunApiFactory(module);
  }
}