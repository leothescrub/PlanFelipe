package Vista;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class About extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public About() {
		setBounds(100, 100, 696, 435);
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Proveedores", "Facturas", "Productos"}));
		comboBox.setBounds(91, 28, 346, 43);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(91, 82, 194, 43);
		getContentPane().add(comboBox_1);

	}
}
