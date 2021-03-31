package com.dontler.life;

import com.dontler.life.entity.Cell;
import com.dontler.life.entity.CellType;

import java.util.List;

public class LifeStrategy {

    public boolean shouldLive(Cell cell, List<Cell> neighbours) {
        var numberOfLiving = neighbours.stream().filter(
                c -> c.getCellType().equals(CellType.ALIVE)
        ).count();

        if (cell.getCellType().equals(CellType.ALIVE)) {
            return numberOfLiving >= 2 && numberOfLiving <= 3;
        }

        return numberOfLiving == 3;
    }

}
