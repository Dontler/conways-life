package com.dontler.life.entity;

import java.util.List;

public class PlaneConfig {

    private final int width;
    private final int height;
    private final List<Cell> initialPlaces;

    public PlaneConfig(int width, int height, List<Cell> initialPlaces) {
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

    public List<Cell> getInitialPlaces() {
        return initialPlaces;
    }
}
