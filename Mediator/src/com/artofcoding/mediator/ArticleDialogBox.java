package com.artofcoding.mediator;

public class ArticleDialogBox extends DialogBox {
    private ListBox articleListBox = new ListBox(this);
    private  TextBox tittleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        System.out.println("Textbox: "+ tittleTextBox.getContent());
        System.out.println("Button: "+ saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if (control == articleListBox) {
            articleSelected();
        } else if (control == tittleTextBox) {
            titleChanged();
        }

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
