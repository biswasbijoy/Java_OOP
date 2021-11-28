import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
public class WinkingFaceWithTongue extends JPanel{
        
        public void paintComponent(Graphics g) {
                super.paintComponent(g);

                //Face
                g.setColor(Color.yellow);
                g.fillOval(20, 20, 190, 190);

                //EYE1
                g.setColor(Color.black);
                g.drawOval(57, 64, 52, 52);
                g.setColor(Color.white);
                g.fillOval(58, 65, 50, 50);
                g.setColor(Color.black);
                g.fillOval(68, 75, 30, 30);
                //g.fillArc(60, 80, 45, 50, -180, -180);
                //g.setColor(Color.yellow);
                //g.fillArc(60, 90, 45, 50, -180, -180);


                //EYE2
                /*g.setColor(Color.white);
                g.fillOval(132, 65, 50, 50);
                g.setColor(Color.black);
                g.fillOval(142, 76, 30, 30);*/
                g.fillArc(129, 80, 50, 50, -120, -200);
                g.setColor(Color.yellow);
                g.fillArc(129, 90, 50, 50, -120, -200);

                //Smile
                g.setColor(Color.black);
                g.fillArc(65, 95, 100, 93, 180, 180);

                g.setColor(Color.red);
                g.fillArc(70, 90, 90, 125, 180, 180);
        }
}
