import com.artofcofing.state.BrushTool;
import com.artofcofing.state.Canvas;
import com.artofcofing.state.SelectionTool;
import com.artofcofing.state.abuse.Stopwatch;

public class Main {
    public static void main(String[] args) {
        System.out.println("State Pattern!");

        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        // Abuse
        System.out.println("Abuse");
        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();

    }
}