package Vista;



import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


import Atxy2k.CustomTextField.RestrictedTextField;


import Controlador.ControlRegisEncar;

import Modelo.panel;
import java.awt.Font;



public class RegisEncar extends JFrame {

	private JPanel contentPane;
	public static JTextField textNom;
	public static JTextField textApell;
	public static JTextField textID;
	
	private JButton btnRegistrar;



	
	public RegisEncar() {
		setFont(new Font("Century Gothic", Font.PLAIN, 12));
		setTitle("Agregar encargado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(RegisEncar.class.getResource("/imagenes/Shopping_cart_Icon_256.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 361, 239);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0,0));
		panel p = new panel("/imagenes/6895843-minimal-digital-backgrounds.jpg");
		
		contentPane.add(p, BorderLayout.CENTER);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		JLabel lblId = new JLabel("Codigo");
		lblId.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		
		textNom = new JTextField();
		RestrictedTextField restriNom = new RestrictedTextField(textNom);
		restriNom.setOnlyText(true);
		restriNom.setLimit(20);
		textNom.setColumns(10);
		
		textApell = new JTextField();
		textApell.setColumns(10);
		RestrictedTextField restriApell = new RestrictedTextField(textApell);
		restriApell.setOnlyText(true);
		restriApell.setLimit(20);
		
		
		textID = new JTextField();
		
		textID.setColumns(10);
		RestrictedTextField restriID = new RestrictedTextField(textID);
		restriID.setOnlyNums(true);
		restriID.setLimit(8);
		
		btnRegistrar = new JButton("REGISTRAR");
	
		btnRegistrar.addActionListener(new ControlRegisEncar (this, "btnRegistrar"));
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(p);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(59)
					.addComponent(btnRegistrar, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
					.addGap(45))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textNom, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textApell, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textID, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(171, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellido)
						.addComponent(textApell, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
					.addComponent(btnRegistrar, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		p.setLayout(gl_contentPane);
		contentPane.setSize(400,400);
	}
}
