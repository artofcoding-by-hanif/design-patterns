package com.artofcoding.cor;

import java.util.Objects;

public class LowLevelSupport extends Handler {
    public LowLevelSupport(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(String request) {
        super.handle(request);
        if (Objects.equals(request, "basic_issue")) {
            System.out.println("LowLevelSupport i'll handle the basic issue.");
        } else if (this.handler != null) {
            this.handler.handle(request);
        }
    }
}
