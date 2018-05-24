package com.xshalk.observer;

public class Test {
    public static void main(String[] args) {
        System.out.println("this is Observer Model");

        WeatherData weatherData = new WeatherData();
        CurrentConditonDisplay currentDisply = new CurrentConditonDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
