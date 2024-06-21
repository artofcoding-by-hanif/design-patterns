package com.artofcoding.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {

    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright"));
        for (Slide slide: slides) {
            builder.addSlide(slide);
        }
//        if (format == PresentationFormat.PDF) {
//            var pdf = new PdfDocument();
//            for (Slide slide: slides) {
//                pdf.addPage(slide.getText());
//            }
//        } else if (format == PresentationFormat.MOVIE) {
//            var movie = new Movie();
//            for (Slide slide: slides) {
//                movie.addFrame(slide.getText(), 10);
//            }
//        }
    }
}
