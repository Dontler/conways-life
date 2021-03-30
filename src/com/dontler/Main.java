package com.dontler;

import com.dontler.life.LifeStrategy;
import com.dontler.life.entity.*;
import com.dontler.life.LifeCycle;
import com.dontler.life.ui.PaintConfig;
import com.dontler.life.ui.Painter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var cycle = bootstrap();

        for (int i = 0; i < 300; i++) {
            cycle.play();
        }
    }

    private static LifeCycle bootstrap() {
        var initialPlaces = new ArrayList<Cell>();
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(1, 5)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(2, 5)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(1, 6)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(2, 6)));

        initialPlaces.add(new Cell(CellType.ALIVE, new Point(35, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(36, 4)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(36, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(35, 4)));

        initialPlaces.add(new Cell(CellType.ALIVE, new Point(11, 5)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(11, 6)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(11, 7)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(12, 4)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(12, 8)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(13, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(13, 9)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(14, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(14, 9)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(15, 6)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(16, 4)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(16, 8)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(17, 5)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(17, 6)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(17, 7)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(18, 6)));

        initialPlaces.add(new Cell(CellType.ALIVE, new Point(21, 5)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(21, 4)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(21, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(22, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(22, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(22, 3)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(23, 2)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(23, 6)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(25, 1)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(25, 2)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(25, 6)));
        initialPlaces.add(new Cell(CellType.ALIVE, new Point(25, 7)));

        var config = new PlaneConfig(38, 15, initialPlaces);
        var plane = new Plane(config);

        var paintConfig = new PaintConfig(38, 15);
        var painter = new Painter(paintConfig);
        var strategy = new LifeStrategy();

        return new LifeCycle(plane, painter, strategy);
    }
}
