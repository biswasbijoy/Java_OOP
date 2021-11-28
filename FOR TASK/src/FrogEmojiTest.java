import javax.swing.JFrame;
public class FrogEmojiTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();
                FrogEmoji panel = new FrogEmoji();



                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.setSize(250, 230);
                app.add(panel);
                app.setVisible(true);

        }

}
