package ictgradschool.industry.bounce;

public class OvalShape extends Shape {


    public OvalShape() {
        super();
    }

    public OvalShape(int x, int y, int deltaX, int deltaY) {
        super(x, y, deltaX, deltaY);
    }

    public OvalShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        super(x, y, deltaX, deltaY, width, height);
    }


    @Override
    public void paint(Painter painter) {
        painter.drawOval(fX, fY, fWidth, fHeight);

    }
}
