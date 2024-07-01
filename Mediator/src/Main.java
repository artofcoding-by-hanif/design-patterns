import com.artofcoding.mediator.ArticleDialogBox;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator Pattern!");

        var dialog = new ArticleDialogBox();
        dialog.simulateUserInteraction();

        System.out.println("Mediator Pattern Implemented with Observer!");

        var dialog2 = new com.artofcoding.mediatorwithobserver.ArticleDialogBox();
        dialog2.simulateUserInteraction();

    }
}