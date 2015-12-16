package coffee;

import dagger.Module;
import dagger.Provides;

import javax.enterprise.inject.Produces;

@Module
class PumpModule {
  @Produces
  Pump providePump(Thermosiphon pump) {
    return pump;
  }
}
