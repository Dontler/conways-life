package com.dontler.life.entity;

public class Cell {

    private CellType cellType;

    public Cell(CellType cellType) {
        this.cellType = cellType;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return cellType == cell.cellType;
    }

    @Override
    public int hashCode() {
        return cellType != null ? cellType.hashCode() : 0;
    }
}
