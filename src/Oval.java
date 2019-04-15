import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Oval extends Shape
{
    private int diameter1;
    private int diameter2;
    
    public Oval(Point pointUL, int diameter1, int diameter2, Color color, boolean filled)    {
        super(color, filled);
        this.diameter1 = diameter1;
        this.diameter2 = diameter2;
        location = new Point[1];
        location[0] = pointUL;
    }

    @Override
    public void draw(Graphics graphics)
    {
        int x = location[0].x;
        int y = location[0].y;
        int width = this.diameter1;
        int height = this.diameter2;
        if (this.isFilled() == true) {
            graphics.fillOval(x, y, width, height);
        }
        else {
            graphics.drawOval(x, y, width, height);
        }
        
    }
    public int getDiameter1() {
        return this.diameter1;
    }
    public int getDiameter2() {
        return this.diameter2;
    }


    
}
