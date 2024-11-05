import com.artofcoding.example.Forest;
import com.artofcoding.flyweight.PointIconFactory;
import com.artofcoding.flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        System.out.println("FlyWeight!");

        var service = new PointService(new PointIconFactory());
        for (var point: service.getPoints()) {
            point.draw();
        }

        System.out.println("\n");

        // Example 2
        Forest forest = new Forest();

        // Plant trees with similar types to share memory
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(50, 80, "Oak", "Green", "Rough");
        forest.plantTree(30, 40, "Pine", "Blue", "Smooth");

        forest.drawForest();
    }
}