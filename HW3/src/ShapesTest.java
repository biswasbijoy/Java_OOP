import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ShapesTest {
        
        public static void main(String[] args) {
                
                String input = JOptionPane.showInputDialog("Enter 1 for Rectengulars\n" + "Enter 2 for Ovals");
                
                int choice = Integer.parseInt(input);
                
                Shapes panel = new Shapes(choice);
                
                JFrame app = new JFrame();
                
                
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(300, 300);
                app.setVisible(true);
                
                
        }
        
}