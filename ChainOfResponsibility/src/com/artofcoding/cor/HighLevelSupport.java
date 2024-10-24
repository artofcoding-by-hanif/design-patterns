package com.artofcoding.cor;

import java.util.Objects;

public class HighLevelSupport extends Handler{
    public HighLevelSupport(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(String request) {
        super.handle(request);

        if (Objects.equals(request, "complex_issue")) {
            System.out.println("HighLevelSupport: I'll support complex issue");
        } else if (this.handler != null) {
            this.handler.handle(request);
        }
    }
}
