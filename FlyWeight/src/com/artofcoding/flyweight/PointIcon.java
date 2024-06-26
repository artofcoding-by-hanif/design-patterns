package com.artofcoding.flyweight;

public class PointIcon {
    private final PointType type; // 4 bytes
    private final byte[] icon; // 20 KB / byte

    public PointType getType() {
        return type;
    }

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }
}
