import javax.swing.JFrame;
public class HahaTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();
                Haha panel = new Haha();
                
                
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(500, 500);
                app.setVisible(true);
                
        }
        
}