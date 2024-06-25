package com.artofcoding.decorator;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        stream.write(compress(data));
    }

    private String compress(String data) {
        return  data.substring(0, 3);
    }
}
