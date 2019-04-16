import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
/**
 * Oval class that extends shape; creates an oval
 * @author Aaron
 *
 */
public class Oval extends Shape
{
    /**
     * diameter1: width of oval
     * diameter2: height of oval
     */
    private int diameter1;
    private int diameter2;
    
    /**
     * Constructor for an oval
     * @param pointUL: upper left point of oval
     * @param diameter1: width of oval
     * @param diameter2: height of oval
     * @param color: shape color
     * @param filled: is true if filled
     */
    public Oval(Point pointUL, int diameter1, int diameter2, Color color, boolean filled)    {
        super(color, filled);
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
        location = new Point[1];
        location[0] = pointUL;
    }

    /**
     * draw method for an oval; draws using the upper left corner of the oval and 
     * uses the graphics draw/fill oval method to create an oval from the point
     */
    @Override
    public void draw(Graphics graphics)
    {
        int x = location[0].x;
        int y = location[0].y;
        int width = this.diameter1;
        int height = this.diameter2;
        
        graphics.setColor(this.getColor());
        
        if (this.isFilled() == true) {
            graphics.fillOval(x, y, width, height);
        }
        else {
            graphics.drawOval(x, y, width, height);
        }
        
    }
    /**
     * 
     * @returns width of oval
     */
    public int getDiameter1() {
        return this.diameter1;
    }
    /**
     * 
     * @returns height of oval
     */
    public int getDiameter2() {
        return this.diameter2;
    }


    
}
