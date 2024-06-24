import com.artofcoding.bridge.AdvancedRemoteControl;
import com.artofcoding.bridge.RemoteControl;
import com.artofcoding.bridge.SonyTV;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern!");
//        var remoteControl = new RemoteControl(new SonyTV());
//        remoteControl.turnOn();

        var remoteControl = new AdvancedRemoteControl(new SonyTV());
        remoteControl.setChannel(1);
    }
}