package com.dontler.life.entity;

import java.util.Objects;

public class Cell {

    private CellType cellType;
    private final Point position;

    public Cell(CellType cellType, Point position) {
        this.cellType = cellType;
        this.position = position;
    }

    public CellType getCellType() {
        return cellType;
    }

    public Point getPosition() {
        return position;
    }

    public void die() {
        this.cellType = CellType.DEAD;
    }

    public void revive() {
        this.cellType = CellType.ALIVE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (cellType != cell.cellType) return false;
        return Objects.equals(position, cell.position);
    }

    @Override
    public int hashCode() {
        int result = cellType != null ? cellType.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }
}
