package com.artofcoding.builder;

public class MovieBuilder implements PresentationBuilder{
    private Movie movie = new Movie();
    @Override
    public void addSlide(Slide slide) {
        movie.addFrame(slide.getText(), 10);
    }

    public Movie getMovie() {
        return  movie;
    }
}
