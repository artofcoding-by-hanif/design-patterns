import com.artofcoding.factoryMethod.demo.ProductsController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method!");

        new ProductsController().listProducts();
    }
}