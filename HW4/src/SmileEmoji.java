import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
public class SmileEmoji extends JPanel{
        
        public void paintComponent(Graphics g) {
                
                super.paintComponent(g);
                
                g.setColor(Color.yellow);
                g.fillOval(10, 10, 200, 200);
                
                
                g.setColor(Color.black);
                g.fillOval(55, 65, 30, 30);
                g.fillOval(135, 65, 30, 30);
                
                
                g.fillOval(50, 110, 120, 60);
                
                
                g.setColor(Color.yellow);
                g.fillOval(50, 110, 120, 30);
                g.fillOval(50, 120, 120, 30);
        }
        
}