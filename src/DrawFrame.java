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
        Shape oval1 = new Oval(new Point(110, 110), 15, 7, Color.WHITE, true);
        Shape oval2 = new Oval(new Point(140, 110), 15, 7, Color.WHITE, true);
        Shape oval3 = new Oval(new Point(112, 125), 45, 20, Color.YELLOW, true);
        Shape tri2 = new IsoscelesTriangle(new Point(110,125), 50, 10, Color.BLACK, true);
        Shape tri3 = new RightTriangle(new Point(130, 85), -10, -30,Color.BLACK, true); 
        Shape tri4 = new RightTriangle(new Point(160, 85), -12, -30,Color.BLACK, true); 
        Shape circ2 = new Circle(new Point(215, -10), 100, Color.WHITE, true);
        Shape circ3 = new Circle(new Point(220, -5), 90, Color.GRAY, false);
        Shape tri5 = new IsoscelesTriangle(new Point(270, 35), -20, 20, Color.BLACK, true); 
        Shape dia1 = new Diamond(new Point(235, 40), 15, Color.BLACK, true);
        Shape dia2 = new Diamond(new Point(265, 40), 15, Color.BLACK, true);
        Shape tri6 = new IsoscelesTriangle(new Point(257, 35), -5, -15, Color.BLACK, true); 
        Shape tri7 = new IsoscelesTriangle(new Point(267, 35), -5, -15, Color.BLACK, true); 
        Shape dia3 = new Diamond(new Point(230, 40), 20, Color.GRAY, false);
        Shape dia4 = new Diamond(new Point(260, 40), 20, Color.GRAY, false);



        drawPanel.addShape(rect1);
        drawPanel.addShape(rect2);
        drawPanel.addShape(tri1);
        drawPanel.addShape(circ1);
        drawPanel.addShape(oval1);
        drawPanel.addShape(oval2);
        drawPanel.addShape(oval3);
        drawPanel.addShape(tri2);
        drawPanel.addShape(tri3);
        drawPanel.addShape(tri4);
        drawPanel.addShape(circ2);
        drawPanel.addShape(circ3);
        drawPanel.addShape(dia3);
        drawPanel.addShape(dia4);
        drawPanel.addShape(tri5);
        drawPanel.addShape(dia1);
        drawPanel.addShape(dia2);
        drawPanel.addShape(tri6);
        drawPanel.addShape(tri7);

        Sinusoid sin = new Sinusoid(Color.GREEN, new Point(1,230), 4, 10, 7);
        drawPanel.addShape(sin);




        
        frame.add(drawPanel);
        frame.setVisible(true);

    }
    
    public static void main(String[] args) {

        DrawFrame frame = new DrawFrame("Lab10");

        
    }
}
