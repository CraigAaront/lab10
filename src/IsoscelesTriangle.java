import java.awt.Color;
import java.awt.Point;

public class IsoscelesTriangle extends Triangle
{

    public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled)    {
        super(pointLB, color, filled);
        location[2] = new Point(pointLB.x + base, pointLB.y);
        location[1] = new Point((int) (0.5 * base + pointLB.x), (pointLB.y + height));
    }
}
