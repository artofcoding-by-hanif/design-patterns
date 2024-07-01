package com.artofcoding.mediatorwithobserver;

public class ArticleDialogBox {
    private ListBox articleListBox = new ListBox();
    private TextBox tittleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticleDialogBox() {
        articleListBox.addEventHandler(new EventHandler() {
            @Override
            public void handle() {
                articleSelected();
            }
        });

//        OR
//        tittleTextBox.attach(() -> titleChanged() );
//        OR
        tittleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        System.out.println("Textbox: "+ tittleTextBox.getContent());
        System.out.println("Button: "+ saveButton.isEnabled());
    }


    private void titleChanged() {
        var content = tittleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(isEmpty);
    }

    private void articleSelected() {
        tittleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }
}
