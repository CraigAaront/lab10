import java.awt.Color;
import java.awt.Point;

public class RightTriangle extends Triangle
{

    RightTriangle(Point pointRightAngle, int base, int height,Color color, boolean filled) 
    {
        super(pointRightAngle, color, filled);
        location[1] = new Point(pointRightAngle.x, pointRightAngle.y + height);
        location[2] = new Point(pointRightAngle.x + base, pointRightAngle.y);
    }

}
