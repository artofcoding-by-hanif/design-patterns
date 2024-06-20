import com.artofcoding.abstractFactory.demo.ant.AntWidgetFactory;
import com.artofcoding.abstractFactory.demo.app.ContactForm;
import com.artofcoding.abstractFactory.demo.material.MaterialWidgetFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory!");

        new ContactForm().render(new AntWidgetFactory());
        new ContactForm().render(new MaterialWidgetFactory());
    }
}