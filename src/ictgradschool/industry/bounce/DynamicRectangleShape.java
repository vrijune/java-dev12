package ictgradschool.industry.bounce;

import java.awt.*;

public class DynamicRectangleShape extends Shape {

    private static Color DEFAULT_Color = Color.BLACK;


    public DynamicRectangleShape() {
        super();

    }


    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, Color DEFAULT_Color) {
        super(x, y, deltaX, deltaY);
        this.DEFAULT_Color = DEFAULT_Color;
    }

    public DynamicRectangleShape(int x, int y, int deltaX, int deltaY, int width, int height, Color DEFAULT_Color) {
        super(x, y, deltaX, deltaY, width, height);

        this.DEFAULT_Color = DEFAULT_Color;

    }

    @Override
    public void move(int width, int height) {
        super.move(width, height);

        int x = fDeltaX;
        int y = fDeltaY;
        if (fDeltaX ==  )


    }

    @Override
    public void paint(Painter painter) {

        if()


    }

}