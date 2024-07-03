package com.artofcoding.observer.pull;

import com.artofcoding.observer.pull.DataSource;

public class SpreadSheet implements Observer {
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet notified: "+ dataSource.getValue());
    }
}
