package Vista;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;


import Controlador.ControlVentana;
import Modelo.panel;




public class Ventana extends JFrame {

	private JPanel contentPane;
	private JButton btnRegistrarEncargado;
	private JButton btnRegistrarProbeedor;
	private JButton btnRegistrarCom;

	//static Ventana framero = new Ventana();
//	static TestVentana fram = new TestVentana();
//	static RegisEncar Re = new RegisEncar();
	private JButton button;
	
	
	public Ventana() {
		setResizable(false);
		
		setFont(new Font("Algerian", Font.BOLD, 14));
		setTitle("Sistema de Compras");
		
		setForeground(Color.PINK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/imagenes/Shopping_cart_Icon_256.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 437);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(SystemColor.window);
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0,0));
		panel p = new panel("/imagenes/cra.jpg");
		
		p.setToolTipText("");
		contentPane.add(p, BorderLayout.CENTER);
		
		JLabel lblBienvenidoAlSistema = new JLabel("   BIENVENIDO AL SISTEMA");
		lblBienvenidoAlSistema.setFont(new Font("Century Gothic", Font.ITALIC, 18));
		
		btnRegistrarEncargado = new JButton(" Registrar \r\nEncargado");
	
		btnRegistrarEncargado.addActionListener(new ControlVentana (this,"btnRegisEncar"));
		btnRegistrarEncargado.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		btnRegistrarEncargado.setForeground(Color.BLUE);
		
		JLabel lblElijaUnaOpcion = new JLabel("ELIJA UNA OPCION");
		lblElijaUnaOpcion.setFont(new Font("Century Gothic", Font.ITALIC, 18));
		
		btnRegistrarProbeedor = new JButton(" Registrar \r\nProveedor");
		btnRegistrarProbeedor.addActionListener(new ControlVentana (this,"btnRegisProbee"));
		btnRegistrarProbeedor.setForeground(Color.BLUE);
		btnRegistrarProbeedor.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		
		btnRegistrarCom = new JButton(" Registrar \r\nCompra");
		
	
		btnRegistrarCom.addActionListener(new ControlVentana (this,"btnRegisCom"));
		btnRegistrarCom.setForeground(Color.BLUE);
		btnRegistrarCom.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		
		button = new JButton(" Registrar \r\nProducto");
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		
		
		
		GroupLayout gl_p = new GroupLayout(p);
		gl_p.setHorizontalGroup(
			gl_p.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_p.createSequentialGroup()
					.addContainerGap(113, Short.MAX_VALUE)
					.addComponent(lblBienvenidoAlSistema, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addGap(94))
				.addGroup(gl_p.createSequentialGroup()
					.addGap(75)
					.addGroup(gl_p.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRegistrarEncargado, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRegistrarCom, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnRegistrarProbeedor, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(78, Short.MAX_VALUE))
				.addGroup(gl_p.createSequentialGroup()
					.addContainerGap(149, Short.MAX_VALUE)
					.addComponent(lblElijaUnaOpcion, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addGap(102))
		);
		gl_p.setVerticalGroup(
			gl_p.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBienvenidoAlSistema, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(lblElijaUnaOpcion, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnRegistrarEncargado, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnRegistrarProbeedor, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnRegistrarCom, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(41))
		);
		p.setLayout(gl_p);
		contentPane.setSize(400,400);
		
	}

}
