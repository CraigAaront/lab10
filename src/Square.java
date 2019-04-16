import java.awt.Color;
import java.awt.Point;

/**
 * Square class; creates a rectangle with equal width and height
 * @author Aaron
 *
 */
public class Square extends Rectangle
{
    
    /**
     * Constructor for square; calls the rectangle constructor
     * @param pointUL: upper left point
     * @param width: square width/length
     * @param color: shape color
     * @param filled: true if filled
     */
    public Square(Point pointUL, int width, Color color, boolean filled)
    {
        super(pointUL, width, width, color, filled);
    }

}
