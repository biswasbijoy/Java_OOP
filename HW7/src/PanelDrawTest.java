import javax.swing.*;

public class PanelDrawTest {
        
        public static void main(String[] args) {
                
                JFrame app = new JFrame();

                PanelDraw panel = new PanelDraw();


                app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                app.add(panel);
                app.setSize(300, 300);
                app.setVisible(true);

        }

}
