package com.artofcoding.command.editor;

public class HtmlDocument {
    private String content;


    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void makeBold() {
        content = "<b>" + content + "</b>";
    }
}
