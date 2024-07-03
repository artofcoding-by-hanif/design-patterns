package com.artofcoding.observer.pull;

import com.artofcoding.observer.pull.DataSource;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated with: " + dataSource.getValue());
    }
}
