import com.artofcoding.chainofresponsibility.*;
import com.artofcoding.cor.HighLevelSupport;
import com.artofcoding.cor.LowLevelSupport;
import com.artofcoding.cor.MidLevelSupport;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chain of responsibility!");

        // Auth -> Logger -> compressor

        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "1234"));

        // Test 2
        var handler_chain = new LowLevelSupport(new MidLevelSupport(new HighLevelSupport(null)));

        handler_chain.handle("basic_issue");
        handler_chain.handle("intermediate_issue");
        handler_chain.handle("complex_issue");
    }
}