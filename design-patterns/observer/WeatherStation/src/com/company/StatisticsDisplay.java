package com.company;

/**
 * Created by Jason on 22/03/17.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum= 0.0f;
    private int numberOfReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureSum += temperature;
        numberOfReadings++;

        if (temperature > maxTemperature){
            maxTemperature = temperature;
        }

        if (temperature < minTemperature){
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (temperatureSum / numberOfReadings)
                + "/" + maxTemperature + "/" + minTemperature);
    }
}
