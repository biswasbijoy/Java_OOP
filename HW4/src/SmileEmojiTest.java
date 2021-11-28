import javax.swing.JFrame;
public class SmileEmojiTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();
                SmileEmoji panel = new SmileEmoji();
                
                
                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(230, 250);
                app.setVisible(true);
                
        }
        
}