import com.artofcoding.chainofresponsibility.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chain of responsibility!");

        // Auth -> Logger -> compressor

        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "1234"));
    }
}