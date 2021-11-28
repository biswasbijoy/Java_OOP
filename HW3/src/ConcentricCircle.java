import javax.swing.JPanel;
import java.awt.Graphics;
public class ConcentricCircle extends JPanel{
        
        public void paintComponent(Graphics g) {
                
                super.paintComponent(g);
                
                int height = getHeight() /2;
                int width = getWidth() / 2;
                
                
                for(int i = 0; i < 12; i++) {
                        
                        g.drawOval(width - i * 12, height - i * 12, i * 24, i * 24);
                        
                }
                
        }
        
}