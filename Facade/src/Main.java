import com.artofcoding.facade.Connection;
import com.artofcoding.facade.Message;
import com.artofcoding.facade.NotificationServer;
import com.artofcoding.facade.NotificationService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Pattern");

        var service = new NotificationService();
        service.send("Hello world", "target");
    }
}