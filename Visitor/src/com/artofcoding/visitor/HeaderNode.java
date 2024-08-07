package com.artofcoding.visitor;

public class HeaderNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
