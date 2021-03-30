package com.dontler.life;

import com.dontler.life.entity.*;
import com.dontler.life.ui.Painter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LifeCycle {

    private final Plane plane;
    private final Painter painter;
    private final LifeStrategy strategy;

    public LifeCycle(Plane plane, Painter painter, LifeStrategy strategy) {
        this.plane = plane;
        this.painter = painter;
        this.strategy = strategy;
        this.painter.drawPlane(plane);
    }

    public void play() {
        var survivingCells = new ArrayList<Cell>();
        var dyingCells = new ArrayList<Cell>();

        for (var cell : this.plane.getCells()) {
            if (this.strategy.shouldLive(cell, this.plane.getMooreNeighborhood(cell))) {
                survivingCells.add(cell);

                continue;
            }
            dyingCells.add(cell);
        }

        for (var cell : survivingCells) {
            cell.revive();
        }
        for (var cell : dyingCells) {
            cell.die();
        }

        this.painter.drawPlane(this.plane);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.painter.clearPaint();
    }
}
