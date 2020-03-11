package pl.zzpj2020.solid.dip.weathertracker.solution;

import java.util.Set;

public class WeatherTracker implements WeatherTraceable {
    Set<WeatherWatcher> observers;
    String currentWeather;

    @Override
    public void alertWatchers() {
        observers.forEach(observer -> observer.updateWeather(this.currentWeather));
    }
}
