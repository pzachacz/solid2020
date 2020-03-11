package pl.zzpj2020.solid.dip.weathertracker.solution;

public interface WeatherWatcher {
    void updateWeather(String weather);
    public String generateWeatherAlert();
}
