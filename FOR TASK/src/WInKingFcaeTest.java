import javax.swing.JFrame;
public class WInKingFcaeTest {

        public static void main(String[] args) {
                
                JFrame app = new JFrame();

                WinKingFace panel = new WinKingFace();


                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(240, 260);
                app.setVisible(true);

        }
}
