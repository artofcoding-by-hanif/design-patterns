import com.artofcoding.composite.Group;
import com.artofcoding.composite.Shape;
import com.artofcoding.example.Circle;
import com.artofcoding.example.Drawing;
import com.artofcoding.example.Graphic;
import com.artofcoding.example.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Composite Pattern!");
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        // Add group in another group
        var group = new Group();
        group.add(group1);
        group.add(group2);

        group.render();

        // Example 2
        Graphic circle = new Circle();
        Graphic square = new Square();

        Graphic drawing = new Drawing();
        drawing.add(circle);
        drawing.add(square);

        // Create a larger drawing and add smaller drawings
        Drawing largerDrawing = new Drawing();
        largerDrawing.add(drawing);
        largerDrawing.add(new Circle());

        largerDrawing.render();
    }
}