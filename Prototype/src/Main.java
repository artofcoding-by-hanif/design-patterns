import com.artofcoding.prototype.Circle;
import com.artofcoding.prototype.Component;
import com.artofcoding.prototype.ContextMenu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prototype Pattern!");
        Component circle = new Circle();
        ContextMenu contextMenu = new ContextMenu();
        contextMenu.duplicate(circle);
    }
}