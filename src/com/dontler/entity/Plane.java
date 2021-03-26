package com.dontler.entity;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private final List<PlanePlace> cells;
    private final PlaneConfig config;

    public Plane(PlaneConfig config) {
        this.config = config;
        this.cells = this.initCells();
    }

    public List<PlanePlace> getCells() {
        return cells;
    }

    private List<PlanePlace> initCells() {
        var h = config.getHeight();
        var w = config.getWidth();

        var cells = new ArrayList<PlanePlace>();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                var place = new PlanePlace(new Coordinates(i, j), new Cell(CellType.ALIVE));
                if (!this.config.getInitialPlaces().contains(place)) {
                    place.getCell().setCellType(CellType.DEAD);
                }
                cells.add(place);
            }
        }

        return cells;
    }
}
