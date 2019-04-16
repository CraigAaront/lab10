import java.awt.Color;
import java.awt.Point;
/**
 * RightTriangle; creates a triangle that has a right angle
 * @author Aaron
 *
 */
public class RightTriangle extends Triangle
{

    /**
     * Constructor for rightTriangle
     * @param pointRightAngle: vertex where right angle is
     * @param base: length of base
     * @param height: length of height
     * @param color: color of shape
     * @param filled: true if filled
     */
    RightTriangle(Point pointRightAngle, int base, int height,Color color, boolean filled) 
    {
        super(pointRightAngle, color, filled);
        location[1] = new Point(pointRightAngle.x, pointRightAngle.y + height);
        location[2] = new Point(pointRightAngle.x + base, pointRightAngle.y);
    }

}
