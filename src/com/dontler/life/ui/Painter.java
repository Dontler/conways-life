package com.dontler.life.ui;

import com.dontler.life.entity.CellType;
import com.dontler.life.entity.Plane;
import com.dontler.life.entity.Point;

public class Painter {

    private final PaintConfig config;

    public Painter(PaintConfig config) {
        this.config = config;
    }

    public void drawPlane(Plane plane) {
        var h = this.config.getHeight();
        var w = this.config.getWidth();

        for (int i = 0; i < h; i++) {
            var line = new StringBuilder();
            for (int j = 0; j < w; j++) {
                var cell = plane.getCell(new Point(j, i));
                if (cell.getCellType().equals(CellType.ALIVE)) {
                    line.append("*");
                    continue;
                }
                line.append(" ");
            }
            System.out.println(line.toString());
        }
    }

    public void clearPaint() {
        System.out.print("\033[H\033[2J");
    }
}
