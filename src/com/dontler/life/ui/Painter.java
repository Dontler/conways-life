package com.dontler.life.ui;

import com.dontler.life.entity.CellType;
import com.dontler.life.entity.Plane;

public class Painter {

    private final Plane plane;
    private final PaintConfig config;

    public Painter(Plane plane, PaintConfig config) {
        this.plane = plane;
        this.config = config;
    }

    public void drawPlane() {
        var h = this.config.getHeight();
        var w = this.config.getWidth();

        for (int i = 0; i < h; i++) {
            var line = new StringBuilder();
            for (int j = 0; j < w; j++) {
                var place = this.plane.getPlace(i, j);
                if (place.getCell().getCellType().equals(CellType.ALIVE)) {
                    line.append("*");
                    continue;
                }
                line.append(" ");
            }
            System.out.println(line.toString());
        }
    }
}
