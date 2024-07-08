import com.artofcoding.straegy.BWFilter;
import com.artofcoding.straegy.ImageStorage;
import com.artofcoding.straegy.JpegCompressor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");

        var imageStorage = new ImageStorage(new JpegCompressor(), new BWFilter());
        imageStorage.store("a");
    }
}