import com.artofcoding.iterator.BrowseHistory;
import com.artofcoding.iterator.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Pattern!");

        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
    }
}