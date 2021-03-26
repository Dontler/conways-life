package com.dontler.life;

import com.dontler.life.entity.Plane;
import com.dontler.life.ui.Painter;

public class LifeCycle {

    private final Plane plane;
    private final Painter painter;

    public LifeCycle(Plane plane, Painter painter) {
        this.plane = plane;
        this.painter = painter;
    }

    public void play() {
        var places = this.plane.getPlaces();

        for (var place : places) {

        }
    }

    public Plane getPlane() {
        return plane;
    }
}
