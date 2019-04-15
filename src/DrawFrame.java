import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame
{
    private static DrawPanel drawPanel;
    
    public DrawFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        drawPanel = new DrawPanel();
        Square square = new Square(new Point(100,100) , 50, Color.RED, true);
        Circle circle = new Circle(new Point(50,50), 40, Color.BLUE, true);
        drawPanel.addShape(circle);
        drawPanel.addShape(square);
        
        frame.add(drawPanel);
        frame.setVisible(true);

    }
    
    public static void main(String[] args) {

        DrawFrame frame = new DrawFrame("shit");

        
    }
}
