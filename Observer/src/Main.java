import com.artofcoding.observer.example.ConcreteObserver;
import com.artofcoding.observer.example.ConcreteSubject;
import com.artofcoding.observer.example.Observer;
import com.artofcoding.observer.pull.Chart;
import com.artofcoding.observer.pull.DataSource;
import com.artofcoding.observer.pull.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer Pattern");

        var dataSource = new DataSource();

        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);

        System.out.println("Example 2");

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        // Change state and notify observers
        System.out.println("Setting state to 'State A'");
        subject.setState("State A");

        // Detach an observer
        subject.detach(observer1);

        // Change state again
        System.out.println("Setting state to 'State B'");
        subject.setState("State B");
    }
}