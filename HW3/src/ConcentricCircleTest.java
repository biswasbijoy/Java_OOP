import javax.swing.JFrame;
public class ConcentricCircleTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();
                
                ConcentricCircle panel = new ConcentricCircle();
                
                
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(310, 310);
                app.setVisible(true);
                
        }
        
}