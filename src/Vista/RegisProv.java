package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import javax.swing.JButton;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;;

public class RegisProv extends JFrame {

	private JPanel contentPane;
	public JTextField textRazSoc;
	private JLabel lblDireccin;
	public JTextField textDir;
	private JLabel lblRut;
	public JTextField textRUT;
	private JLabel lblEmail;
	public JTextField textEmail;
	private JLabel lblEstado;
	public JTextField textCiudad;
	private JLabel lblTelef;
	public JTextField textTelf;
	private JLabel lblNewLabel;
	public JTextField textFax;
	public String EstadoSeleccionado; //Aqui se va a guardar lo del cBoxEstado con un EstadoSeleccionado=cBoxEstado.getSelectedItem(); (O algo asi)

	
	public RegisProv() {
		setTitle("Agregar proveedor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 588, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGuardarDatos = new JButton("Guardar datos");
		btnGuardarDatos.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnGuardarDatos.setBounds(347, 239, 192, 77);
		contentPane.add(btnGuardarDatos);
		
		textFax = new JTextField();
		textFax.setBounds(88, 275, 86, 20);
		contentPane.add(textFax);
		textFax.setColumns(10);
		RestrictedTextField restriFax = new RestrictedTextField(textFax);
		restriFax.setOnlyNums(true);
		restriFax.setLimit(11);
		
		lblNewLabel = new JLabel("Fax");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 278, 46, 14);
		contentPane.add(lblNewLabel);
		
		textTelf = new JTextField();
		textTelf.setBounds(88, 240, 86, 20);
		contentPane.add(textTelf);
		textTelf.setColumns(10);
		RestrictedTextField restriTelf = new RestrictedTextField(textTelf);
		restriTelf.setOnlyNums(true);
		restriTelf.setLimit(11);
		
		lblTelef = new JLabel("Telef.");
		lblTelef.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblTelef.setBounds(10, 243, 46, 14);
		contentPane.add(lblTelef);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(88, 209, 86, 20);
		contentPane.add(textCiudad);
		textCiudad.setColumns(10);
		RestrictedTextField restriCiudad = new RestrictedTextField(textCiudad);
		restriCiudad.setAcceptSpace(true);
		restriCiudad.setLimit(15);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblCiudad.setBounds(10, 209, 46, 14);
		contentPane.add(lblCiudad);
		
		JComboBox cBoxEstados = new JComboBox();
		cBoxEstados.setModel(new DefaultComboBoxModel(new String[] {"T\u00E1chira", "Zulia", "Merida", "Distrito Capital", "Miranda", "Anzoategui ", "Bolivar", "Carabobo"}));
		cBoxEstados.setBounds(88, 176, 86, 20);
		contentPane.add(cBoxEstados);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblEstado.setBounds(10, 179, 46, 14);
		contentPane.add(lblEstado);
		
		textEmail = new JTextField();
		textEmail.setBounds(88, 136, 158, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		RestrictedTextField restriEmail = new RestrictedTextField(textEmail);
		restriEmail.setAcceptSpace(false);
		restriEmail.setLimit(20);
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblEmail.setBounds(10, 139, 46, 14);
		contentPane.add(lblEmail);
		
		textRUT = new JTextField();
		textRUT.setBounds(88, 34, 86, 20);
		contentPane.add(textRUT);
		textRUT.setColumns(10);
		RestrictedTextField restriRUT = new RestrictedTextField(textRUT);
		restriRUT.setOnlyNums(true);
		restriRUT.setLimit(8);
		
		lblRut = new JLabel("RUT");
		lblRut.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblRut.setBounds(10, 37, 46, 14);
		contentPane.add(lblRut);
		
		textDir = new JTextField();
		textDir.setBounds(88, 100, 436, 22);
		contentPane.add(textDir);
		textDir.setColumns(10);
		RestrictedTextField restriDir = new RestrictedTextField(textDir);
		restriDir.setAcceptSpace(true);
		restriDir.setLimit(50);
		
		lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblDireccin.setBounds(10, 104, 68, 14);
		contentPane.add(lblDireccin);
		
		JLabel lblRaznSocial = new JLabel("Raz\u00F3n Social");
		lblRaznSocial.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblRaznSocial.setBounds(10, 67, 83, 22);
		contentPane.add(lblRaznSocial);
		
		textRazSoc = new JTextField();
		textRazSoc.setBounds(88, 68, 436, 20);
		contentPane.add(textRazSoc);
		textRazSoc.setColumns(10);
		RestrictedTextField restriRazSoc = new RestrictedTextField(textRazSoc);
		restriRazSoc.setAcceptSpace(true);
		restriRazSoc.setLimit(50);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(RegisProv.class.getResource("/imagenes/6895843-minimal-digital-backgrounds.jpg")));
		Fondo.setBounds(0, 0, 572, 338);
		contentPane.add(Fondo);
	}
}
