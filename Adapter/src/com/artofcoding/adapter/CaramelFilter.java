package com.artofcoding.adapter;

import com.artofcoding.adapter.avaFilter.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        this.caramel.init();
        this.caramel.render(image);
    }
}
