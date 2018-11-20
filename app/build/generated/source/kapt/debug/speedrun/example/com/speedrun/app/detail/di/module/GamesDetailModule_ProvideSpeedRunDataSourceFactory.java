// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package speedrun.example.com.speedrun.app.detail.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import speedrun.example.com.speedrun.data.datasource.SpeedRunApi;
import speedrun.example.com.speedrun.data.datasource.SpeedRunDataSource;
import speedrun.example.com.speedrun.data.datasource.mapper.RunsDtoMapper;
import speedrun.example.com.speedrun.data.datasource.mapper.SpeedRunDtoMapper;

public final class GamesDetailModule_ProvideSpeedRunDataSourceFactory
    implements Factory<SpeedRunDataSource> {
  private final GamesDetailModule module;

  private final Provider<SpeedRunApi> speedRunApiProvider;

  private final Provider<SpeedRunDtoMapper> speedRunDtoMapperProvider;

  private final Provider<RunsDtoMapper> runsDtoMapperProvider;

  public GamesDetailModule_ProvideSpeedRunDataSourceFactory(
      GamesDetailModule module,
      Provider<SpeedRunApi> speedRunApiProvider,
      Provider<SpeedRunDtoMapper> speedRunDtoMapperProvider,
      Provider<RunsDtoMapper> runsDtoMapperProvider) {
    assert module != null;
    this.module = module;
    assert speedRunApiProvider != null;
    this.speedRunApiProvider = speedRunApiProvider;
    assert speedRunDtoMapperProvider != null;
    this.speedRunDtoMapperProvider = speedRunDtoMapperProvider;
    assert runsDtoMapperProvider != null;
    this.runsDtoMapperProvider = runsDtoMapperProvider;
  }

  @Override
  public SpeedRunDataSource get() {
    return Preconditions.checkNotNull(
        module.provideSpeedRunDataSource(
            speedRunApiProvider.get(),
            speedRunDtoMapperProvider.get(),
            runsDtoMapperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SpeedRunDataSource> create(
      GamesDetailModule module,
      Provider<SpeedRunApi> speedRunApiProvider,
      Provider<SpeedRunDtoMapper> speedRunDtoMapperProvider,
      Provider<RunsDtoMapper> runsDtoMapperProvider) {
    return new GamesDetailModule_ProvideSpeedRunDataSourceFactory(
        module, speedRunApiProvider, speedRunDtoMapperProvider, runsDtoMapperProvider);
  }
}