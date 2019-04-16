import java.awt.Color;
import java.awt.Point;
/**
 * Class for isosceles triangle; extends abstract triangle class
 * @author Aaron
 *
 */
public class IsoscelesTriangle extends Triangle
{
    /**
     * Constructor for an isosceles triangle
     * @param pointLB: left bottom corner of the triangle in point form
     * @param base: length of base
     * @param height: height of triangle
     * @param color: shape color
     * @param filled: true if filled
     */
    public IsoscelesTriangle(Point pointLB, int base, int height, Color color, boolean filled)    {
        super(pointLB, color, filled);
        location[2] = new Point(pointLB.x + base, pointLB.y);
        location[1] = new Point((int) (0.5 * base + pointLB.x), (pointLB.y + height));
    }
}
