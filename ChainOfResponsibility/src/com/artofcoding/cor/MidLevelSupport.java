package com.artofcoding.cor;

import java.util.Objects;

public class MidLevelSupport extends Handler{
    public MidLevelSupport(Handler handler) {
        super(handler);
    }

    @Override
    public void handle(String request) {
        super.handle(request);

        if (Objects.equals(request, "intermediate_issue")) {
            System.out.println("MidLevelSupport: I'll handle intermediate issue");
        } else if (this.handler != null){
            this.handler.handle(request);
        }
    }
}
