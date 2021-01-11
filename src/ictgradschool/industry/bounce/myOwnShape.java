package ictgradschool.industry.bounce;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class myOwnShape extends Shape {
//    private static final int height = ;


    public myOwnShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, height, width);


    }


    private BufferedImage image;

    public myOwnShape() {
        try {
            image = ImageIO.read(new File(("unnamed.png")));
        } catch (IOException e) {
            e.getMessage();
        }

    }

    public void paint(Painter painter) {

        Polygon myOwnSha = new Polygon();

        painter.drawPolygon(myOwnSha);
    }


}
