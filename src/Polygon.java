import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * abstract polygon class; extends shape and implements drawable
 * @author Aaron
 *
 */
public abstract class Polygon extends Shape implements Drawable
{
    /**
     * constructor for polygin
     * @param color: color of object
     * @param filled: true if object is filled
     */
    public Polygon(Color color, boolean filled)
    {
        super(color, filled);
    }

    /**
     * draw method for polygon, breaks the points into x and y components and uses the graphics
     * draw function to create a polygon
     */
    @Override
    public void draw(Graphics graphics)
    {
        int[] xPoint = new int[this.location.length];
        int[] yPoint = new int[this.location.length];
        
        int numPoints = location.length;
        
        for(int i =0; i < location.length; i++) {
            xPoint[i] = location[i].x;
            yPoint[i] = location[i].y;
        }
        
        graphics.setColor(this.getColor());
        
        if (this.isFilled() == true) {
            graphics.fillPolygon(xPoint, yPoint, numPoints);
        }
        else {
            graphics.drawPolygon(xPoint, yPoint, numPoints);
        }
       
    }
    
}
