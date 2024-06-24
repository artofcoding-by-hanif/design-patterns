package com.artofcoding.adapter;

import com.artofcoding.adapter.avaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();;apply(image);
    }
}
