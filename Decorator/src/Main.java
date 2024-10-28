import com.artofcoding.decorator.CloudStream;
import com.artofcoding.decorator.CompressedCloudStream;
import com.artofcoding.decorator.EncryptedCloudStream;
import com.artofcoding.decorator.Stream;
import com.artofcoding.example.Coffee;
import com.artofcoding.example.MilkDecorator;
import com.artofcoding.example.SimpleCoffee;
import com.artofcoding.example.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Pattern!");

        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));

        // Example 2
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.getCost());
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("324234-23424-324234-3423");
    }
}