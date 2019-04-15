import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame
{
    private static DrawPanel drawPanel;
    
    public DrawFrame(String title) {
        JFrame frame = new JFrame(title);
        frame.setSize(new Dimension(300,300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        drawPanel = new DrawPanel();
        Shape rect1 = new Rectangle(new Point(0,150) , 300,200, Color.GRAY, true);
        Shape rect2 = new Rectangle(new Point(0,300) , 300,150, Color.BLUE, true);
        Shape tri1 = new IsoscelesTriangle(new Point(100,220), 70, -100, Color.BLACK, true);
        Shape circ1 = new Circle(new Point(100, 75), 75, Color.BLACK, true);
        Shape oval1 = new Oval(new Point(110, 100), 15, 7, Color.WHITE, true);
        Shape oval2 = new Oval(new Point(140, 100), 15, 7, Color.WHITE, true);
        Shape oval3 = new Oval(new Point(112, 125), 45, 20, Color.YELLOW, true);
        Shape tri2 = new IsoscelesTriangle(new Point(110,125), 50, 10, Color.BLACK, true);


        drawPanel.addShape(rect1);
        drawPanel.addShape(rect2);
        drawPanel.addShape(tri1);
        drawPanel.addShape(circ1);
        drawPanel.addShape(oval1);
        drawPanel.addShape(oval2);
        drawPanel.addShape(oval3);
        drawPanel.addShape(tri2);

        
        frame.add(drawPanel);
        frame.setVisible(true);

    }
    
    public static void main(String[] args) {

        DrawFrame frame = new DrawFrame("shit");

        
    }
}
