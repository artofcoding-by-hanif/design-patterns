import com.artofcoding.flyweight.PointIconFactory;
import com.artofcoding.flyweight.PointService;

public class Main {
    public static void main(String[] args) {
        System.out.println("FlyWeight!");

        var service = new PointService(new PointIconFactory());
        for (var point: service.getPoints()) {
            point.draw();
        }

    }
}