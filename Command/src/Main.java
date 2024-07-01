import com.artofcoding.command.*;
import com.artofcoding.command.editor.BoldCommand;
import com.artofcoding.command.editor.History;
import com.artofcoding.command.editor.HtmlDocument;
import com.artofcoding.command.editor.UndoCommand;
import com.artofcoding.command.fx.Button;

public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern!");
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

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

    }
}