import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.Color;
import java.awt.Point;
import org.junit.Assert;

public class SquareTest
{
    @Test
    public void testConstructor() {
        Square square = new Square(new Point(0,0), 10, Color.RED, true);
        Assert.assertEquals("wrong color", Color.RED, square.getColor());
        Point[] points = new Point[4];
        points[0] = new Point(0,0);
        points[1] = new Point(0,-10);
        points[2] = new Point(10,-10);
        points[3] = new Point(10,0);
        Assert.assertEquals("wrong points", points, square.getLocation());
    }
    
}