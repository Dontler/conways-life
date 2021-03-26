package com.dontler.entity;

import java.util.List;

public class PlaneConfig {

    private final int width;
    private final int height;
    private final List<PlanePlace> initialPlaces;

    public PlaneConfig(int width, int height, List<PlanePlace> initialPlaces) {
        this.width = width;
        this.height = height;
        this.initialPlaces = initialPlaces;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<PlanePlace> getInitialPlaces() {
        return initialPlaces;
    }
}
