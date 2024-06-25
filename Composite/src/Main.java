import com.artofcoding.composite.Group;
import com.artofcoding.composite.Shape;

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
    }
}