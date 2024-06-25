import com.artofcoding.decorator.CloudStream;
import com.artofcoding.decorator.CompressedCloudStream;
import com.artofcoding.decorator.EncryptedCloudStream;
import com.artofcoding.decorator.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern!");

        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("324234-23424-324234-3423");
    }
}