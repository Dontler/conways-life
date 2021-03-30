package com.dontler.life.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Plane {
    private final List<Cell> cells;
    private final PlaneConfig config;

    public Plane(PlaneConfig config) {
        this.config = config;
        this.cells = this.initCells();
    }

    public List<Cell> getCells() {
        return cells;
    }

    public Cell getCell(Point point) {
        var place = this.cells.stream().filter(
                c -> c.getPosition().equals(point)
        ).findFirst();
        return place.orElseThrow();
    }

    public List<Cell> getMooreNeighborhood(Cell cell) {
        var x = cell.getPosition().getX();
        var y = cell.getPosition().getY();
        var leftX = x - 1;
        var rightX = x + 1;
        var upY = y - 1;
        var downY = y + 1;

        return this.cells.stream().filter(
                c -> c.getPosition().equals(new Point(leftX, upY))
                || c.getPosition().equals(new Point(x, upY))
                || c.getPosition().equals(new Point(rightX, upY))
                || c.getPosition().equals(new Point(leftX, y))
                || c.getPosition().equals(new Point(rightX, y))
                || c.getPosition().equals(new Point(leftX, downY))
                || c.getPosition().equals(new Point(x, downY))
                || c.getPosition().equals(new Point(rightX, downY))
        ).collect(Collectors.toList());
    }

    private List<Cell> initCells() {
        var h = config.getHeight();
        var w = config.getWidth();

        var cells = new ArrayList<Cell>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                var cell = new Cell(CellType.ALIVE, new Point(j, i));
                if (!this.config.getInitialPlaces().contains(cell)) {
                    cell.die();
                }
                cells.add(cell);
            }
        }

        return cells;
    }
}
