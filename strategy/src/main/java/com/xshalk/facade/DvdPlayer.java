package com.xshalk.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("Dvd Player on");
    }

    public void play(String movie) {
        System.out.println("Dvd Player paly movie:" + movie);
    }

    public void eject() {
        System.out.println("DVD Player eject");
    }
    public void off() {
        System.out.println("DVD Player off");
    }
}
