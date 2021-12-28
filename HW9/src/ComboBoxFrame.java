import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame{
        
        private final JComboBox<String> imageJComboBox;
        private final JLabel label;

        private static final String[] names = {
                "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"
        };

        private final Icon[] icons = {
                new ImageIcon(getClass().getResource(names[0])),
                new ImageIcon(getClass().getResource(names[1])),
                new ImageIcon(getClass().getResource(names[2])),
                new ImageIcon(getClass().getResource(names[3])),

        };


        public ComboBoxFrame() {
                super("Testing JComboBox");
                setLayout(new FlowLayout());

                imageJComboBox = new JComboBox<String>(names);
                imageJComboBox.setMaximumRowCount(3);

                imageJComboBox.addItemListener(new ItemListener() {
                        @Override
                        public void itemStateChanged(ItemEvent event) {
                                if(event.getStateChange() == ItemEvent.SELECTED) {
                                        label.setIcon(icons[imageJComboBox.getSelectedIndex()]);
                                }
                        }
                });

                add(imageJComboBox);
                label = new JLabel(icons[0]);
                add(label);
        }

}
