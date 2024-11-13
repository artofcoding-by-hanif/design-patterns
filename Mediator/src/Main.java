import com.artofcoding.example.ChatMediator;
import com.artofcoding.example.ChatRoom;
import com.artofcoding.example.ChatUser;
import com.artofcoding.example.User;
import com.artofcoding.mediator.ArticleDialogBox;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Pattern!");

        var dialog = new ArticleDialogBox();
        dialog.simulateUserInteraction();

        System.out.println("Mediator Pattern Implemented with Observer!");

        var dialog2 = new com.artofcoding.mediatorwithobserver.ArticleDialogBox();
        dialog2.simulateUserInteraction();

        System.out.println("Example 2");
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "charlie");

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi Alice!");
        user3.sendMessage("Hello Alice and Bob!");

    }
}