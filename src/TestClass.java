import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;

public class TestClass
{
    /**
     * tests the square/rectangle classes
     */
    @Test
    public void testSquare() {
        Square square = new Square(new Point(0,0), 10, Color.RED, true);
        Assert.assertEquals("wrong color", Color.RED, square.getColor());
        Assert.assertEquals("isFilled is wrong", true, square.isFilled());
        Point[] points = new Point[4];
        points[0] = new Point(0,0);
        points[1] = new Point(0,-10);
        points[2] = new Point(10,-10);
        points[3] = new Point(10,0);
        Assert.assertEquals("wrong points", points, square.getLocation());
    }
    /**
     * tests the triangle classes
     */
    @Test
    public void testTriangle() {
        Shape tri1 = new IsoscelesTriangle(new Point(0,0), 20, 20, Color.BLACK, true);
        Assert.assertEquals("wrong color", Color.BLACK, tri1.getColor());
        Assert.assertEquals("isFilled is wrong", true, tri1.isFilled());
        Point[] points = new Point[3];
        points[0] = new Point(0,0);
        points[2] = new Point(20,0);
        points[1] = new Point(10,20);
        Assert.assertEquals("wrong points", points, tri1.getLocation());

        Shape tri2 = new RightTriangle(new Point(0, 0), 10, 10,Color.BLACK, false); 
        Assert.assertEquals("wrong color", Color.BLACK, tri2.getColor());
        Assert.assertEquals("isFilled is wrong", false, tri2.isFilled());
        Point[] points2 = new Point[3];
        points2[0] = new Point(0,0);
        points2[1] = new Point(0,10);
        points2[2] = new Point(10,0);
        Assert.assertEquals("wrong points", points, tri1.getLocation());

    }
    
}