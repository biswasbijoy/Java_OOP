import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
public class BullsEye extends JPanel{
        
        public void paintComponent(Graphics g) {
                
                super.paintComponent(g);
                
                int height = getHeight() /2;
                int width = getWidth() / 2;
                
                
                for(int i = 6; i > 0; i--) {
                        if(i % 2 == 0) {
                                g.setColor(Color.blue);
                                g.fillOval(width - i * 12, height - i * 12, i * 24, i * 24);
                        }
                        
                        else {
                                g.setColor(Color.red);
                                g.fillOval(width - i * 12, height - i * 12, i * 24, i * 24);
                        }
                                
                        
                }
                
        }
        
}