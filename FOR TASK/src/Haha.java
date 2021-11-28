import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
public class Haha extends JPanel{
        
        public void paintComponent(Graphics g) {
                
                super.paintComponent(g);
                

                //Face
                g.setColor(Color.yellow);
                g.fillArc(10, 10, 200, 220, -180, -180);
                g.fillArc(10, 10, 200, 220, 180, 180);


                //Smile
                g.setColor(Color.black);
                g.fillArc(60, 120, 100, 90, 180, 180);
                g.setColor(Color.yellow);
                g.fillArc(58, 100, 105, 90, 180, 180);


                //EYE1
                g.setColor(Color.black);
                g.drawArc(45, 80, 40, 60, -140, -140);
                g.drawArc(45, 80, 40, 60, 220, 220);
                g.setColor(Color.black);
                g.fillOval(59, 100, 15, 20);

                //EYE2
                g.setColor(Color.black);
                g.drawArc(130, 80, 40, 60, -140, -140);
                g.drawArc(130, 80, 40, 60, 220, 220);
                g.fillOval(143, 100, 15, 20);
                
                //EYE
                /*g.setColor(Color.black);
                g.fillOval(55, 65, 30, 30);
                g.fillOval(135, 65, 30, 30);
                
                //Mouth
                g.fillOval(50, 110, 115, 65);

                //g.setColor(Color.WHITE);
                //g.fillOval(51, 120, 113, 40);
                
                //Smile
                g.setColor(Color.yellow);
                g.fillOval(50, 110, 120, 30);
                g.fillOval(50, 155, 120, 35);*/
        }
        
}