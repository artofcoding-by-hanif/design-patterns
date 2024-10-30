package com.artofcoding.example;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        projector.setWideScreenMode();
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        projector.off();
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
    }
}
