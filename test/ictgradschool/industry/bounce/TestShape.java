package ictgradschool.industry.bounce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases to test classes Shape/RectangleShape.
 *
 * @author Ian Warren
 */
class TestShape {
    private MockPainter painter;

    @BeforeEach
    void setUp() {
        painter = new MockPainter();
    }

    @Test
    public void testSimpleMove() {
        RectangleShape shape = new RectangleShape(100, 20, 12, 15);
        shape.paint(painter);
        shape.move(500, 500);
        shape.paint(painter);
        assertEquals("(rectangle 100,20,25,35)(rectangle 112,35,25,35)",
                painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffRight() {
        RectangleShape shape = new RectangleShape(100, 20, 12, 15);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        shape.move(135, 10000);
        shape.paint(painter);
        assertEquals("(rectangle 100,20,25,35)(rectangle 110,35,25,35)"
                + "(rectangle 98,50,25,35)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffLeft() {
        RectangleShape shape = new RectangleShape(10, 20, -12, 15);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        shape.move(10000, 10000);
        shape.paint(painter);
        assertEquals("(rectangle 10,20,25,35)(rectangle 0,35,25,35)"
                + "(rectangle 12,50,25,35)", painter.toString());
    }

    @Test
    public void testShapeMoveWithBounceOffBottomAndRight() {
        RectangleShape shape = new RectangleShape(10, 90, -12, 15);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        shape.move(125, 135);
        shape.paint(painter);
        assertEquals("(rectangle 10,90,25,35)(rectangle 0,100,25,35)"
                + "(rectangle 12,85,25,35)", painter.toString());
    }
}