import java.awt.Color;
import java.awt.Point;
/**
 * abstract shape class; implements drawable interface
 * hosts methods for getColor,getLocation and isFIlled
 * @author Aaron
 *
 */
public abstract class Shape implements Drawable
{
    private Color color;
    private boolean filled;
    protected Point[] location;
    
    /**
     * constructor for shape
     * @param color: shape color
     * @param filled: true if filled
     */
    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    /**
     * 
     * @returns shape color
     */
    public Color getColor() {
        return this.color;
    }
    /**
     * 
     * @returns true if the shape is filled
     */
    public boolean isFilled() {
        return this.filled;
    }
    /**
     * 
     * @returns a point array with the point locations for each shape
     */
    public Point[] getLocation() {
        return this.location;
    }
}