package pl.zzpj2020.solid.dip.weathertracker.solution;

import java.util.Objects;

public class Phone implements WeatherWatcher {
    private static final String weatherConditions = "rainy";

    @Override
    public void updateWeather(String weather) {
        if (Objects.equals(weatherConditions, weather)) {
            generateWeatherAlert();
        }
    }

    @Override
    public String generateWeatherAlert() {
        String alert = "It is a bad weather";
        return alert;
    }
}
