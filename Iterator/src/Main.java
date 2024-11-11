import com.artofcoding.example.Book;
import com.artofcoding.example.BookCollection;
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

        // Example 2:

        BookCollection bookCollection = new BookCollection(5);
        bookCollection.addBook(new Book("Design Patterns"));
        bookCollection.addBook(new Book("Effective Java"));
        bookCollection.addBook(new Book("Clean code"));

        com.artofcoding.example.Iterator<Book> iterator1 = bookCollection.createIterator();
        while (iterator1.hasNext()) {
            Book book = iterator1.next();
            System.out.println("Book title: "+ book.getTitle());
        }

    }
}