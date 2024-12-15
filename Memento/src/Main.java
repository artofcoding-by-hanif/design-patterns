import com.artofcoding.example.Caretaker;
import com.artofcoding.example.Originator;
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

        // Example 2
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Set initial state and save it
        originator.setState("State #1");
        caretaker.addMemento(originator.saveStateToMemento());

        // Change state and save it
        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento());

        // Change state without saving
        originator.setState("State #3");
        System.out.println("Current State: " + originator.getState());

        // Restore previous state
        originator.restoreStateFromMemento(caretaker.getMemento(1));
        System.out.println("Restored to State: " + originator.getState());

        // Restore to first state
        originator.restoreStateFromMemento(caretaker.getMemento(0));
        System.out.println("Restored to State: " + originator.getState());

    }
}