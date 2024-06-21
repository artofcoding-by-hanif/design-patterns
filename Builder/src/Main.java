import com.artofcoding.builder.MovieBuilder;
import com.artofcoding.builder.PdfDocumentBuilder;
import com.artofcoding.builder.Presentation;
import com.artofcoding.builder.Slide;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Pattern!");
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var pdfBuilder = new PdfDocumentBuilder();
        presentation.export(pdfBuilder);
        var pdf = pdfBuilder.getPDFDocument();

        var moviewBuilder = new MovieBuilder();
        presentation.export(moviewBuilder);
        var movie = moviewBuilder.getMovie();
    }
}