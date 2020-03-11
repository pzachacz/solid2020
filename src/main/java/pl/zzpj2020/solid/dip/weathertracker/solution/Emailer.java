package pl.zzpj2020.solid.dip.weathertracker.solution;

import java.util.Objects;

public class Emailer implements WeatherWatcher {
    private static final String weatherConditions = "sunny";

    @Override
    public void updateWeather(String weather) {
        if (Objects.equals(weatherConditions, weather)) {
            generateWeatherAlert();
        }
    }

    @Override
    public String generateWeatherAlert() {
        String alert = "Beautiful weather";
        return alert;
    }
}
