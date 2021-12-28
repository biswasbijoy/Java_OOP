import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class ListFrame extends JFrame{

        private final JList<String> colorJList;
        private static final String[] colorsName = {
                "Black", "Blue", "Cyan",
                "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
                "Orange", "Pink", "Red", "White", "Yellow" 
        };

        private static final Color[] colors = {Color.BLACK, Color.BLUE,
                Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
                Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
                Color.RED, Color.WHITE, Color.YELLOW};
        
        public ListFrame() {
                super("List Test");
                setLayout(new FlowLayout());


                colorJList = new JList<String>(colorsName);
                colorJList.setVisibleRowCount(5);


                colorJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                add(new JScrollPane(colorJList));

                colorJList.addListSelectionListener(
                        new ListSelectionListener() {
                                @Override
                                public void valueChanged(ListSelectionEvent event) {
                                        getContentPane().setBackground(
                                                colors[colorJList.getSelectedIndex()]
                                        );
                                }
                        }
                );
        }
}
