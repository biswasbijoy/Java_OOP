import javax.swing.JFrame;
public class WinKingFaceWithTongueTest {
        
        public static void main(String[] args) {
                JFrame app = new JFrame();

                WinkingFaceWithTongue panel = new WinkingFaceWithTongue();


                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(240, 260);
                app.setVisible(true);
        }

}
