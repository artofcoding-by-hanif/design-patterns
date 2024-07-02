import com.artofcoding.memento.Editor;
import com.artofcoding.memento.History;

public class Main {
    public static void main(String[] args) {
        System.out.println("Memento Pattern!");

        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}