import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
public class Angry extends JPanel{
        
        public void paintComponent(Graphics g) {

                super.paintComponent(g);

                //Face
                g.setColor(Color.red);
                g.fillOval(10, 10, 200, 200);


                //EYE1
                g.setColor(Color.black);
                g.drawArc(40, 80, 55, 56, -220, -118);
                g.fillOval(60, 83, 30, 30);



                //EYE2
                g.setColor(Color.black);
                g.drawArc(123, 80, 55, 56, -200, -120);
                g.fillOval(127, 83, 30, 30);


                //Angry Reaction
                g.setColor(Color.black);
                g.fillArc(68, 120, 90, 80, -180, -180);
                g.setColor(Color.red);
                g.fillArc(68, 140, 90, 80, -180, -180);
        }

}
