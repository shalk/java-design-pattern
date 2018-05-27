package com.xshalk.facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    //爆米花
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get Ready to watch a movie...");
        popper.on();
        popper.pop();
        System.out.println("....");
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shuting movie theater down...");
        popper.off();
        System.out.println("....");
        dvd.eject();
        dvd.off();
    }
}
