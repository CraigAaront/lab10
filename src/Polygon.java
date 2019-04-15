import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Polygon extends Shape implements Drawable
{
    public Polygon(Color color, boolean filled)
    {
        super(color, filled);
    }

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
