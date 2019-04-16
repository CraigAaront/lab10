import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Component;



public class DrawPanel extends JPanel
{
    private ArrayList<Shape> shapeList;
    public DrawPanel() {
        shapeList = new ArrayList<Shape>();
    }
    
    public void addShape(Shape shape) {
        shapeList.add(shape);
    }
    protected void paintComponent(Graphics graphics) {
        for (int i = 0; i <shapeList.size(); i++) {
            shapeList.get(i).draw(graphics);
        }
    }
}
