package com.dontler;

import com.dontler.life.entity.*;
import com.dontler.life.LifeCycle;
import com.dontler.life.ui.PaintConfig;
import com.dontler.life.ui.Painter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var cycle = bootstrap();
        var plane = cycle.getPlane();

        cycle.play();
    }

    private static LifeCycle bootstrap() {
        var initialPlaces = new ArrayList<PlanePlace>();
        initialPlaces.add(new PlanePlace(new Coordinates(49, 49), new Cell(CellType.ALIVE)));
        initialPlaces.add(new PlanePlace(new Coordinates(50, 49), new Cell(CellType.ALIVE)));
        initialPlaces.add(new PlanePlace(new Coordinates(49, 50), new Cell(CellType.ALIVE)));
        initialPlaces.add(new PlanePlace(new Coordinates(48, 49), new Cell(CellType.ALIVE)));
        initialPlaces.add(new PlanePlace(new Coordinates(49, 46), new Cell(CellType.ALIVE)));
        initialPlaces.add(new PlanePlace(new Coordinates(48, 46), new Cell(CellType.ALIVE)));
        initialPlaces.add(new PlanePlace(new Coordinates(49, 47), new Cell(CellType.ALIVE)));

        var config = new PlaneConfig(100, 100, initialPlaces);
        var plane = new Plane(config);

        var paintConfig = new PaintConfig(100, 100);
        var painter = new Painter(plane, paintConfig);

        return new LifeCycle(plane, painter);
    }
}
