import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
public class UpSideDown extends JPanel{
        
        public void paintComponent(Graphics g) {
                
                super.paintComponent(g);
                

                //Face
                g.setColor(Color.yellow);
                g.fillArc(10, 10, 200, 220, -180, -180);
                g.fillArc(10, 10, 200, 220, 180, 180);


                //Smile
                g.setColor(Color.black);
                g.fillArc(60, 70, 100, 90, -180, -180);
                g.setColor(Color.yellow);
                g.fillArc(50, 90, 120, 90, -180, -180);


                //EYE1
                g.setColor(Color.black);
                g.drawArc(45, 125, 40, 60, -140, -140);
                g.drawArc(45, 125, 40, 60, 220, 220);
                g.setColor(Color.black);
                g.fillOval(57, 150, 15, 20);

                //EYE2
                g.setColor(Color.black);
                g.drawArc(130, 125, 40, 60, -140, -140);
                g.drawArc(130, 125, 40, 60, 220, 220);
                g.fillOval(144, 150, 15, 20);
                
        }
        
}