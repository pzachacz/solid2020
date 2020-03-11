package pl.zzpj2020.solid.dip.weathertracker.solution;

import java.util.Set;

public class WeatherTracker implements WeatherTraceable {
    Set<WeatherWatcher> watchers;
    String currentWeather;

    @Override
    public void alertWatchers() {
        watchers.forEach(observer -> observer.updateWeather(this.currentWeather));
    }
}
