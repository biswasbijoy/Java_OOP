import javax.swing.JFrame;
public class DrawRainbowTest {

    public static void main(String[] args) {
        
        JFrame app = new JFrame();

        DrawRainbow panel = new DrawRainbow();


        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(400, 250);
        app.setVisible(true);
    }
    
}
