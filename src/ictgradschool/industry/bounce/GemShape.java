package ictgradschool.industry.bounce;

import java.awt.*;

public class GemShape extends Shape {
    public GemShape() {
        super();
    }

    public GemShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    public GemShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);


    }


    @Override
    public void paint(Painter painter) {

        Polygon Gem = new Polygon();

        if (getWidth() > 40) {
            Gem.addPoint(fX + 20, fY);
            Gem.addPoint(fX - 20 + fWidth, fY);
            Gem.addPoint(fX + fWidth, fY + fHeight / 2);
            Gem.addPoint(fX + fWidth - 20, fY + fHeight);
            Gem.addPoint(fX + 20, fY + fHeight);
            Gem.addPoint(fX, fY + fHeight / 2);
        }


        if (getWidth() < 40) {
            Gem.addPoint(fX, fY + fHeight / 2);
            Gem.addPoint(fX + fWidth / 2, fY);
            Gem.addPoint(fX + fWidth, fY + fHeight / 2);
            Gem.addPoint(fX + fWidth / 2, fY + fHeight);


        }

        painter.drawPolygon(Gem);
    }


}

