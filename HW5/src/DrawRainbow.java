import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
public class DrawRainbow extends JPanel{
    
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);



    private Color[] colors = {Color.white, VIOLET, INDIGO, Color.blue, Color.green,
        Color.yellow, Color.orange, Color.red};


    
        public DrawRainbow() {
            setBackground(Color.white);
        }


        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            int radius = 20;

            int centerX = getWidth() / 2;

            int centerY = getHeight() - 10;


            for(int counter = colors.length; counter > 0; counter--) {

                g.setColor(colors[counter - 1]);


                g.fillArc(centerX - counter * radius, centerY - counter * radius, 
                    counter * radius * 2, counter * radius * 2, 0, 180);

            }

        }
}