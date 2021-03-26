package com.dontler.life.entity;

import java.util.Objects;

public class PlanePlace {

    private final Coordinates coordinates;
    private final Cell cell;

    public PlanePlace(Coordinates coordinates, Cell cell) {
        this.coordinates = coordinates;
        this.cell = cell;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Cell getCell() {
        return cell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlanePlace that = (PlanePlace) o;

        if (!Objects.equals(coordinates, that.coordinates)) return false;
        return Objects.equals(cell, that.cell);
    }

    @Override
    public int hashCode() {
        int result = coordinates != null ? coordinates.hashCode() : 0;
        result = 31 * result + (cell != null ? cell.hashCode() : 0);
        return result;
    }
}
