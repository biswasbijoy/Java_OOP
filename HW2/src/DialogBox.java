import javax.swing.JOptionPane;
public class DialogBox {
        
        public static void main(String[] args) {
                
                String name = JOptionPane.showInputDialog("Enter your name: ");
                
                
                String message = String.format("Welcome, %s, to Java programming", name);
                
                
                JOptionPane.showMessageDialog(null, message);
                
        }
        
        
}