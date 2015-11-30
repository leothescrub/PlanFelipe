package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import Atxy2k.CustomTextField.RestrictedTextField;
import Controlador.ControlRegisProd;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisProd extends JFrame {

	private JPanel contentPane;
	public JTextField textProdCod;
	public JTextField textDescr;
	public JTextField textPrecio;

	public RegisProd() {
		setTitle("Agregar producto");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 401, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar datos");
		btnGuardar.addActionListener(new ControlRegisProd(this, "btnGuardar")); 
		btnGuardar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btnGuardar.setBounds(183, 154, 192, 68);
		contentPane.add(btnGuardar);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(104, 92, 86, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		RestrictedTextField restriPrecio = new RestrictedTextField(textPrecio);
		restriPrecio.setLimit(10);
		restriPrecio.setOnlyNums(true);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblPrecio.setBounds(10, 95, 46, 14);
		contentPane.add(lblPrecio);
		
		textDescr = new JTextField();
		textDescr.setBounds(104, 56, 262, 20);
		contentPane.add(textDescr);
		textDescr.setColumns(10);
		RestrictedTextField restriDescr = new RestrictedTextField(textDescr);
		restriDescr.setLimit(20);
		restriDescr.setAcceptSpace(true);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblDescripcin.setBounds(10, 59, 94, 14);
		contentPane.add(lblDescripcin);
		
		textProdCod = new JTextField();
		textProdCod.setBounds(104, 19, 86, 20);
		contentPane.add(textProdCod);
		textProdCod.setColumns(10);
		RestrictedTextField restriProdCod = new RestrictedTextField(textProdCod);
		restriProdCod.setLimit(9);
		restriProdCod.setAcceptSpace(false);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblCodigo.setBounds(10, 22, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(RegisProd.class.getResource("/imagenes/6895843-minimal-digital-backgrounds.jpg")));
		Fondo.setBounds(0, 0, 437, 262);
		contentPane.add(Fondo);
	}
}
