package com.xshalk.facade;

public class HomeTheaterTest {
    public static void main(String[] args) {
        DvdPlayer dvd = new DvdPlayer();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(null, null,dvd,null,null,null,null,popper);
        homeTheater.watchMovie("Pi");
        homeTheater.endMovie();
    }
}
