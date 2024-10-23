package com.artofcoding.bridge;

import java.util.List;

public class AIRemoteControl extends RemoteControl {
    public AIRemoteControl(Device device) {
        super(device);
    }

    public void speechRecognize(List<Byte> audio) {
        // NEED TO EDIT DEVICE AND ITS IMPLEMENTATIONS TO ADD NEW FUNCTIONALITY
        this.device.setChannel();
    }
}
