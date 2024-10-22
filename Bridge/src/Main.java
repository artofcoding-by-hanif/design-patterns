import com.artofcoding.bridge.AdvancedRemoteControl;
import com.artofcoding.bridge.RemoteControl;
import com.artofcoding.bridge.SonyTV;
import com.artofcoding.shape_bridge.Circle;
import com.artofcoding.shape_bridge.RasterRenderer;
import com.artofcoding.shape_bridge.Renderer;
import com.artofcoding.shape_bridge.VectorRenderer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern!");

//      Example 1
        var remoteControl = new RemoteControl(new SonyTV());
        var remoteControl2 = new AdvancedRemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl2.setChannel(1);

//      Example 2
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rastorRenderer = new RasterRenderer();
        Circle circle1 = new Circle(vectorRenderer, 10);
        Circle circle2 = new Circle(rastorRenderer, 10);
        circle1.draw();
        circle2.draw();


    }
}