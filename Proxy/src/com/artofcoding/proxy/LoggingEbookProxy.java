package com.artofcoding.proxy;

public class LoggingEbookProxy implements Ebook{
    private String fileName;
    private RealEbook ebbok;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {

        if (ebbok == null)
            ebbok = new RealEbook(fileName);

        System.out.println("Logging");
        ebbok.show();

    }

    @Override
    public String getFileName() {
        return this.fileName;
    }
}
