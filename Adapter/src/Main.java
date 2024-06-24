import com.artofcoding.adapter.*;
import com.artofcoding.adapter.avaFilter.Caramel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Pattern!");

        var imageView = new ImageView(new Image());
        imageView.applyFilter(new VividFilter());
        imageView.applyFilter(new CaramelFilter(new Caramel())); // Using Composition
        imageView.applyFilter(new CaramelAdapter()); // Using inheritance

        // Favor Composition over Inheritance.
    }
}