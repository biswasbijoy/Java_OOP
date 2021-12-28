import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleSelectionFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	private JList<String> colorJList;		
	private JList<String> copyJList;		
	private JButton copyJButton;
	private final String colorNames[] = {"Black", "Blue", "Cyan",
			"Dark Grey", "Gray", "Green", "Light Gray", "Magenta",
			"Orange", "Pink", "Red", "White", "Yellow" };
	
	
	public MultipleSelectionFrame() {
		
		super("Multiple Selection Lists");
		setLayout(new FlowLayout());		
		
		colorJList = new JList<String>(colorNames);	
		colorJList.setVisibleRowCount(5);	
		colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(colorJList));	
		
		copyJButton = new JButton("Copy >>>");	
		copyJButton.addActionListener(
				
				new ActionListener() { 		
					
					
					public void actionPerformed(ActionEvent event) {
						
						
                                                copyJList.setListData(
                                                        colorJList.getSelectedValuesList().toArray(
                                                        new String[0]));						
					} 
					
				} 
				
		);	
		
		add(copyJButton);
		
		copyJList = new JList<String>();			
		copyJList.setVisibleRowCount(5);	
		copyJList.setFixedCellWidth(100);	
		copyJList.setFixedCellHeight(15);	
		copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copyJList));	
		
	}
	
}