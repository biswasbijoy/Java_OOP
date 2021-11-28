import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class Emoji extends JPanel{

        public int choice;

        public Emoji(int choice) {

                this.choice = choice;

        }

        public void paintComponent(Graphics g) {

                super.paintComponent(g);

                switch(choice) {

                        case 1 :
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
                                break;

                        
                        case 2 :
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
                                break;


                        case 3:
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
                                break;


                        case 4:
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
                                break;
                        

                        case 5:
                                super.paintComponent(g);


                                //Face
                                g.setColor(Color.YELLOW);
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
                                break;


                        case 6 :
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
                                break;
                }

        }

}
