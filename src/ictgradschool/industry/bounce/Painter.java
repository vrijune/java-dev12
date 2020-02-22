package ictgradschool.industry.bounce;

import java.awt.*;

/** 
 * Interface to represent a type that offers primitive drawing methods.
 * 
 * @author Ian Warren
 */
public interface Painter {
	/**
	 * Draws a rectangle. Parameters x and y specify the top left corner of the
	 * oval. Parameters width and height specify its width and height.
	 */
	public void drawRect(int x, int y, int width, int height);
	
	/**
	 * Draws an oval. Parameters x and y specify the top left corner of the
	 * oval. Parameters width and height specify its width and height.
	 */
	public void drawOval(int x, int y, int width, int height);
	
	/**
	 * Draws a line. Parameters x1 and y1 specify the starting point of the 
	 * line, parameters x2 and y2 the ending point.
	 */
	public void drawLine(int x1, int y1, int x2, int y2);

	/**
	 * Sets the color of this Painter to the given value.
	 */
	public void setColor(Color color);

	/**
	 * Gets the current color of this Painter.
	 */
	public Color getColor();

    /**
     * Draws a polygon.
     *
     * @param polygon
     */
    public void drawPolygon(Polygon polygon);

    /**
     * Draws a filled rectangle.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public void fillRect(int x, int y, int width, int height);
}
