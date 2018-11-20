// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package speedrun.example.com.speedrun.app.detail.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource;
import speedrun.example.com.speedrun.data.repository.SpeedRunRepository;

public final class GamesDetailModule_ProvideSpeedRunRepositoryFactory
    implements Factory<SpeedRunRepository> {
  private final GamesDetailModule module;

  private final Provider<SpeedRunDataSource> speedRunDataSourceProvider;

  public GamesDetailModule_ProvideSpeedRunRepositoryFactory(
      GamesDetailModule module, Provider<SpeedRunDataSource> speedRunDataSourceProvider) {
    assert module != null;
    this.module = module;
    assert speedRunDataSourceProvider != null;
    this.speedRunDataSourceProvider = speedRunDataSourceProvider;
  }

  @Override
  public SpeedRunRepository get() {
    return Preconditions.checkNotNull(
        module.provideSpeedRunRepository(speedRunDataSourceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SpeedRunRepository> create(
      GamesDetailModule module, Provider<SpeedRunDataSource> speedRunDataSourceProvider) {
    return new GamesDetailModule_ProvideSpeedRunRepositoryFactory(
        module, speedRunDataSourceProvider);
  }
}