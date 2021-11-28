import javax.swing.JFrame;
public class AngryTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();
                Angry panel = new Angry();

                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(230, 260);
                app.setVisible(true);

        }

}
