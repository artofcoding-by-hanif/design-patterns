import com.artofcoding.proxy.EbookProxy;
import com.artofcoding.proxy.LoggingEbookProxy;
import com.artofcoding.proxy.RealEbook;
import com.artofcoding.proxy.Library;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy Pattern!");

        var library = new Library();
        String[] fileNames = { "a", "b", "c" };

        for (var fileName : fileNames) {
//            library.add(new EbookProxy(fileName));
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }
}