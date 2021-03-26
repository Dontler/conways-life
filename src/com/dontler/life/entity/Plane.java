package com.dontler.life.entity;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private final List<PlanePlace> places;
    private final PlaneConfig config;

    public Plane(PlaneConfig config) {
        this.config = config;
        this.places = this.initCells();
    }

    public List<PlanePlace> getPlaces() {
        return places;
    }

    public PlanePlace getPlace(int x, int y) {
        var place = this.places.stream().filter(
                pp -> pp.getCoordinates().getX() == x && pp.getCoordinates().getY() == y
        ).findFirst();
        return place.orElseThrow();
    }

    private List<PlanePlace> initCells() {
        var h = config.getHeight();
        var w = config.getWidth();

        var cells = new ArrayList<PlanePlace>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
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
