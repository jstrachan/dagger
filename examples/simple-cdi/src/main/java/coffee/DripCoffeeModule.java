package coffee;

import dagger.Module;
import dagger.Provides;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

@Module(includes = PumpModule.class)
class DripCoffeeModule {
  @Produces
  @Singleton Heater provideHeater() {
    return new ElectricHeater();
  }
}
