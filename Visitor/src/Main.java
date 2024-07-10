import com.artofcoding.visitor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern!");

        var document = new HtmlDocument();
        document.add(new HeaderNode());
        document.add(new AnchorNode());

        document.execute(new HighlightOperation());
        document.execute(new PlainTextOperation());
    }
}