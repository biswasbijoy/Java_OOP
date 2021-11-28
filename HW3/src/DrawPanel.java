import java.awt.Graphics;
import javax.swing.JPanel;
public class DrawPanel extends JPanel{
        
        public void paintComponent(Graphics g) {
                
                super.paintComponent(g);
                
                int height = getHeight();
                
                int width = getWidth();
                
                
                g.drawLine(0, 0,width, height);
                
                g.drawLine(0, height, width, 0);
                
        }
        
}