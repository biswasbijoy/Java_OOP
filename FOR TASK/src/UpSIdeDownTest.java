import javax.swing.JFrame;
public class UpSIdeDownTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();
                UpSideDown panel = new UpSideDown();
                
                
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(500, 500);
                app.setVisible(true);
                
        }
        
}