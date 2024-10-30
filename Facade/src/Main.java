import com.artofcoding.example.Amplifier;
import com.artofcoding.example.DVDPlayer;
import com.artofcoding.example.HomeTheaterFacade;
import com.artofcoding.example.Projector;
import com.artofcoding.facade.Connection;
import com.artofcoding.facade.Message;
import com.artofcoding.facade.NotificationServer;
import com.artofcoding.facade.NotificationService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Pattern");

        var service = new NotificationService();
        service.send("Hello world", "target");

        // Test 2
        // Instantiate subsystem components
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector);

        // Use the facade to watch and end a movie
        homeTheater.watchMovie("The Matrix");
        homeTheater.endMovie();
    }
}