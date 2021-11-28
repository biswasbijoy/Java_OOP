import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EmojiTest {
        
        public static void main(String[] args) {
                JFrame app = new JFrame();
                
                
                Object[] emoji = {"Angry", "Frog", "Haha", "Up_Side_Down", "Winking_Face", "Winking_Face_With_Tongue"};
                Object option = JOptionPane.showInputDialog(null, "Select Emoji", "Emoji", JOptionPane.INFORMATION_MESSAGE, null, emoji, emoji[0]);

                HashMap < String, Integer> stringValue = new HashMap<>();
                stringValue.put("Angry", 1);
                stringValue.put("Frog", 2);
                stringValue.put("Haha", 3);
                stringValue.put("Up_Side_Down", 4);
                stringValue.put("Winking_Face", 5);
                stringValue.put("Winking_Face_With_Tongue", 6);


                int choice = stringValue.get((String) option);
                Emoji panel = new Emoji(choice);


                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(300, 350);
                app.setVisible(true);
        }

}
