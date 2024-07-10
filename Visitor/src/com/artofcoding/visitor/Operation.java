package com.artofcoding.visitor;

public interface Operation {
    void apply(HeaderNode heading);
    void apply(AnchorNode anchor);
}
