import com.artofcoding.singleton.ConfigManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton!");
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Hanif");

        ConfigManager manager2 = ConfigManager.getInstance();
        System.out.println(manager2.get("name"));
    }
}