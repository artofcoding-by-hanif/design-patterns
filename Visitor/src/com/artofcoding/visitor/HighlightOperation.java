package com.artofcoding.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeaderNode heading) {
        System.out.println("highlight - heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("highlight - anchor");
    }
}
