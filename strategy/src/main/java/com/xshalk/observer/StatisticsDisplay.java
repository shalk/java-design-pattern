package com.xshalk.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatures;
    private Subject weatherData;
    private float max = Float.MIN_VALUE;
    private float min = Float.MAX_VALUE;
    private float ave = 0;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        temperatures = new ArrayList<>();
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperatures = " + ave + "/" + max + "/" + min);
    }

    @Override
    public void update(Object... arg) {
        float temp = (float) arg[0];
        max = Math.max(max, temp);
        min = Math.min(min, temp);
        ave = (ave * temperatures.size() + temp) / (temperatures.size() + 1);
        temperatures.add(temp);
        display();
    }
}
