import javax.swing.JFrame;
public class BullsEyeTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();
                BullsEye panel = new BullsEye();
                
                
                
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(320, 320);
                app.setVisible(true);
                
        }
        
}