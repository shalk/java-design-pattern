package com.xshalk.observer;

public class CurrentConditonDisplay implements Observer, DisplayElement {
    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditonDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditons: " + temperature + "F degrees and "
                + humidity + "% humidity");
    }

    @Override
    public void update(Object... arg) {
        this.temperature = (float) arg[0];
        this.humidity = (float) arg[1];
        display();
    }
}
