package com.dontler;

import com.dontler.entity.*;
import com.dontler.life.LifeCycle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var cycle = bootstrap();
        var plane = cycle.getPlane();

        for (var place : plane.getCells()) {
            var out = String.format("Coordinates: [%d, %d]. Cell: [%s]",
                    place.getCoordinates().getX(),
                    place.getCoordinates().getY(),
                    place.getCell().getCellType().name()
            );
            System.out.println(out);
        }
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
        initialPlaces.add(new PlanePlace(new Coordinates(51, 49), new Cell(CellType.ALIVE)));

        var config = new PlaneConfig(100, 100, initialPlaces);
        var plane = new Plane(config);

        return new LifeCycle(plane);
    }
}
