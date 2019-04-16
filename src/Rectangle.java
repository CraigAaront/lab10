import java.awt.Color;
import java.awt.Point;
/**
 * Rectangle class that extends polygon
 * @author Aaron
 *
 */
public class Rectangle extends Polygon 
{
    /**
     * Constructor for rectangle
     * @param pointUL: upper left corner, in form of a point
     * @param width: rectangle width
     * @param height: rectangle height
     * @param color: shape color
     * @param filled: true if filled
     */
    public Rectangle(Point pointUL, int width,int height,Color color,boolean filled)
    {
        super(color, filled);
        location = new Point[4];
        location[0] = pointUL;
        location[1] = new Point(pointUL.x, pointUL.y - height);
        location[2] = new Point(pointUL.x + width, pointUL.y - height);
        location[3] = new Point(pointUL.x + width, pointUL.y);
    }    
}
