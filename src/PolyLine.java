import java.awt.Color;
import java.awt.Point;
/**
 * Polyline class that extends polygon
 * @author Aaron
 *
 */
public class PolyLine extends Polygon
{
    /**
     * The "upper-left" (UL) point. 1: The "upper-right" (UR) point. 2: The "lower-right" point. 
     * This has the same x value as the upper-right but has a y value such that: lr.y = ur.y + thickness. 
     * 3: The "lower-left" point. This has the same x value as the upper-left but has a y value such that:
     * ll.y = ul.y + thickness.
     * @param pointUL: upper left point
     * @param pointUR: upper right point
     * @param thickness: thickness between lines
     * @param color: shape color
     * @param filled: true if filled
     */
    PolyLine(Point pointUL, Point pointUR, int thickness,Color color, boolean filled)    {
        super(color, filled);
        location = new Point[4];
        location[0] = pointUL;
        location[1] = pointUR;
        location[2] = new Point(pointUR.x, pointUR.y + thickness);
        location[3] = new Point(pointUL.x, pointUL.y + thickness);
    }
}
