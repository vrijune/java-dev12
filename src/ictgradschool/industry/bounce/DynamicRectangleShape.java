package ictgradschool.industry.bounce;

import java.awt.*;

public class DynamicRectangleShape extends Shape {

    private static Color DEFAULT_Color = Color.BLACK;
    private boolean checkFilled = false;


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

    public void setCheckFilled(boolean checkFilled){
        this.checkFilled = checkFilled;
    }




    @Override
    public void paint(Painter painter) {

        if (!checkFilled) {
            painter.setColor(DEFAULT_Color);
            painter.drawRect(fX, fY, fWidth, fHeight);
        } else {

            painter.setColor(DEFAULT_Color);
            painter.fillRect(fX, fY, fWidth, fHeight);


        }

    }
}