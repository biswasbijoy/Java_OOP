import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class FrogEmoji extends JPanel {

        public void paintComponent(Graphics g) {

                super.paintComponent(g);


                //Mundu
                g.setColor(Color.green);
                g.fillOval(20, 30, 200, 150);

                //Chowk1
                g.fillOval(35, 15, 60, 60);
                g.setColor(Color.white);
                g.fillOval(42, 23, 40, 40);
                g.setColor(Color.black);
                g.fillOval(47, 28, 30, 30);



                //Chowk2
                g.setColor(Color.green);
                g.fillOval(143, 14, 60, 60);
                g.setColor(Color.white);
                g.fillOval(152, 20, 40, 40);
                g.setColor(Color.black);
                g.fillOval(157, 25, 30, 30);


                //Muk
                g.setColor(Color.black);
                g.fillArc(62, 80, 122, 81, 180, 180);
                g.setColor(Color.white);
                g.fillArc(63, 92, 120, 55, 180, 180);
                g.setColor(Color.green);
                g.fillArc(63, 70, 122, 68, 180, 180);
                g.setColor(Color.black);
                g.fillOval(85, 79, 15, 15);
                g.fillOval(145, 79, 15, 15);
                

        }

}