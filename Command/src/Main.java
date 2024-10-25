import com.artofcoding.command.*;
import com.artofcoding.command.editor.BoldCommand;
import com.artofcoding.command.editor.History;
import com.artofcoding.command.editor.HtmlDocument;
import com.artofcoding.command.editor.UndoCommand;
import com.artofcoding.command.fx.Button;
import com.artofcoding.example.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern!");

        System.out.println("Example 2");
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        System.out.println("Example 2");

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        System.out.println("Example 3");

        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello world");
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

//        boldCommand.unexecute();
//        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

        // Example 2
        System.out.println("Example 4");

        Receiver light = new Receiver();

        // create commands
        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        // Create invoker and assign commands
        Invoker invoker = new Invoker();
        invoker.setCommand(turnOn);
        invoker.pressButton();

        invoker.setCommand(turnOff);
        invoker.pressButton();

    }
}