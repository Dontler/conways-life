package com.dontler.life;

import com.dontler.entity.Plane;

public class LifeCycle {

    private final Plane plane;

    public LifeCycle(Plane plane) {
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }
}
