package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;

import Atxy2k.CustomTextField.RestrictedTextField;
import Controlador.ControlVentanaPrincipal;
import Controlador.Datos;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textRazSocProv;
	public JTextField textNombreEncargado;
	public JTextField textFecha;
	private JTextField textDirProv;
	private JTextField textRUTProv;
	public JTextField textCodEncargadoRecepcion;
	private JTextField textNumGuia;
	private JTextField textEstado;
	private JTextField textCiudad;
	private JTextField textTlf;
	private JTextField textFax;
	private JTextField textGuiaDespacho;
	private JTextField textGDProv;
	private JTextField textNumOC;
	public JTextField textCod;
	public JTextField textPrecio;
	public JTextField textTotal;
	public JTextField textCantidad;
	private JTable registro;
	public String valorneto;
	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1010, 736);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOperadores = new JMenu("Operadores");
		mnOperadores.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		mnOperadores.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/network11 (1).png")));
		menuBar.add(mnOperadores);
		
		JMenu mnEncargados = new JMenu("Encargados");
		mnEncargados.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		mnOperadores.add(mnEncargados);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ControlVentanaPrincipal(this,"AgreEncar"));
		mntmAgregar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnEncargados.add(mntmAgregar);
		
		JMenuItem mntmEditareliminar = new JMenuItem("Editar/Eliminar");
		mntmEditareliminar.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnEncargados.add(mntmEditareliminar);
		
		JMenu mnProveedores = new JMenu("Proveedores");
		mnProveedores.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		mnOperadores.add(mnProveedores);
		
		JMenuItem mntmAgregar_1 = new JMenuItem("Agregar");
		mntmAgregar_1.addActionListener(new ControlVentanaPrincipal(this,"AgreProbee"));
		mntmAgregar_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnProveedores.add(mntmAgregar_1);
		
		JMenuItem mntmEditareliminar_1 = new JMenuItem("Editar/Eliminar");
		mntmEditareliminar_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnProveedores.add(mntmEditareliminar_1);
		
		JMenu mnProductos = new JMenu("Productos");
		mnProductos.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		mnOperadores.add(mnProductos);
		
		JMenuItem mntmAgregar_2 = new JMenuItem("Agregar");
		mntmAgregar_2.addActionListener(new ControlVentanaPrincipal(this,"mntmAgregar_2"));
		mntmAgregar_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnProductos.add(mntmAgregar_2);
		
		JMenuItem mntmEditareliminar_2 = new JMenuItem("Editar/Eliminar");
		mntmEditareliminar_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnProductos.add(mntmEditareliminar_2);
		
		JMenu mnConsultar = new JMenu("Consultar");
		mnConsultar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		mnConsultar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/search12.png")));
		menuBar.add(mnConsultar);
		
		JMenuItem mntmProveedores = new JMenuItem("Proveedores");
		mntmProveedores.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnConsultar.add(mntmProveedores);
		
		JMenuItem mntmFacturas = new JMenuItem("Productos");
		mntmFacturas.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnConsultar.add(mntmFacturas);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Facturas");
		mntmNewMenuItem.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnConsultar.add(mntmNewMenuItem);
		
		JMenu mnCosasDeInteres = new JMenu("Cosas de interes");
		mnCosasDeInteres.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/man216.png")));
		mnCosasDeInteres.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		menuBar.add(mnCosasDeInteres);
		
		JMenuItem mntmManualDePrograma = new JMenuItem("Manual de programa");
		mntmManualDePrograma.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnCosasDeInteres.add(mntmManualDePrograma);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblFecha.setBounds(469, 97, 46, 14);
		contentPane.add(lblFecha);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 353, 835, 219);
		contentPane.add(scrollPane);
		
		registro = new JTable();
		registro.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Código", "Descripción", "Precio", "Cantidad", "Valor Neto"
			}
		));
		scrollPane.setViewportView(registro);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(370, 618, 89, 23);
		contentPane.add(btnSalir);
		
		textTotal = new JTextField();
		textTotal.setEditable(false);
		textTotal.setColumns(10);
		textTotal.setBackground(Color.LIGHT_GRAY);
		textTotal.setBounds(751, 614, 171, 30);
		contentPane.add(textTotal);
		
		JRadioButton rdbtnCerrada = new JRadioButton("Cerrada");
		rdbtnCerrada.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnCerrada.setBackground((Color) null);
		rdbtnCerrada.setBounds(87, 579, 129, 30);
		contentPane.add(rdbtnCerrada);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(494, 618, 89, 23);
		contentPane.add(btnGrabar);
		
		JLabel lblTotalAcumulado = new JLabel("Total acumulado:");
		lblTotalAcumulado.setForeground(Color.WHITE);
		lblTotalAcumulado.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotalAcumulado.setBounds(593, 612, 165, 30);
		contentPane.add(lblTotalAcumulado);
		
		JRadioButton rdbtnAnulada = new JRadioButton("Anulada");
		rdbtnAnulada.setSelected(false);
		rdbtnAnulada.setBounds(87, 614, 129, 30);
		contentPane.add(rdbtnAnulada);
		
		textCantidad = new JTextField();
		textCantidad.setEditable(false);
		textCantidad.setColumns(10);
		textCantidad.setBackground(Color.LIGHT_GRAY);
		textCantidad.setBounds(653, 308, 62, 20);
		contentPane.add(textCantidad);
		
		textPrecio = new JTextField();
		textPrecio.setEditable(false);
		textPrecio.setColumns(10);
		textPrecio.setBackground(Color.LIGHT_GRAY);
		textPrecio.setBounds(442, 307, 120, 20);
		contentPane.add(textPrecio);
		
		JLabel lblCod2 = new JLabel("C\u00F3digo:");
		lblCod2.setForeground(Color.BLACK);
		lblCod2.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblCod2.setBounds(87, 303, 55, 30);
		contentPane.add(lblCod2);
		
		textCod = new JTextField();
		textCod.setEditable(false);
		textCod.setColumns(10);
		textCod.setBackground(Color.LIGHT_GRAY);
		textCod.setBounds(143, 307, 129, 20);
		contentPane.add(textCod);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.BLACK);
		lblCantidad.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblCantidad.setBounds(576, 307, 73, 22);
		contentPane.add(lblCantidad);
		
		JButton btnProcesar = new JButton("Cargar y confirmar linea");
		btnProcesar.addActionListener(new ControlVentanaPrincipal(this, "btnProcesar"));
		btnProcesar.setBounds(743, 307, 179, 23);
		contentPane.add(btnProcesar);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(297, 306, 89, 23);
		contentPane.add(btnCargar);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setForeground(Color.BLACK);
		lblPrecio.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblPrecio.setBounds(396, 305, 55, 24);
		contentPane.add(lblPrecio);
		
		JLabel lblNumeroDeOc = new JLabel("N\u00FAmero de O/C:");
		lblNumeroDeOc.setForeground(Color.BLACK);
		lblNumeroDeOc.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblNumeroDeOc.setBounds(718, 265, 108, 26);
		contentPane.add(lblNumeroDeOc);
		
		textGDProv = new JTextField();
		textGDProv.setEditable(false);
		textGDProv.setColumns(10);
		textGDProv.setBackground(Color.LIGHT_GRAY);
		textGDProv.setBounds(571, 267, 124, 22);
		contentPane.add(textGDProv);
		
		JLabel lblFechaGdProveedor = new JLabel("Fecha G/D Proveedor:");
		lblFechaGdProveedor.setForeground(Color.BLACK);
		lblFechaGdProveedor.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblFechaGdProveedor.setBounds(421, 265, 148, 26);
		contentPane.add(lblFechaGdProveedor);
		
		textGuiaDespacho = new JTextField();
		textGuiaDespacho.setEditable(false);
		textGuiaDespacho.setColumns(10);
		textGuiaDespacho.setBackground(Color.LIGHT_GRAY);
		textGuiaDespacho.setBounds(308, 265, 102, 21);
		contentPane.add(textGuiaDespacho);
		
		textNumOC = new JTextField();
		textNumOC.setEditable(false);
		textNumOC.setColumns(10);
		textNumOC.setBackground(Color.LIGHT_GRAY);
		textNumOC.setBounds(836, 268, 86, 20);
		contentPane.add(textNumOC);
		
		JLabel lblGuiaDeDespacho = new JLabel("Guia de despacho de Prov. N\u00BA:");
		lblGuiaDeDespacho.setForeground(Color.BLACK);
		lblGuiaDeDespacho.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblGuiaDeDespacho.setBounds(87, 267, 202, 22);
		contentPane.add(lblGuiaDeDespacho);
		
		JLabel lblTlf = new JLabel("Tel\u00E9fono:");
		lblTlf.setForeground(Color.BLACK);
		lblTlf.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblTlf.setBounds(509, 226, 102, 24);
		contentPane.add(lblTlf);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setForeground(Color.BLACK);
		lblEstado.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblEstado.setBounds(87, 227, 55, 22);
		contentPane.add(lblEstado);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setForeground(Color.BLACK);
		lblCiudad.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblCiudad.setBounds(248, 227, 76, 22);
		contentPane.add(lblCiudad);
		
		textEstado = new JTextField();
		textEstado.setEditable(false);
		textEstado.setColumns(10);
		textEstado.setBackground(Color.LIGHT_GRAY);
		textEstado.setBounds(152, 227, 86, 20);
		contentPane.add(textEstado);
		
		textTlf = new JTextField();
		textTlf.setEditable(false);
		textTlf.setColumns(10);
		textTlf.setBackground(Color.LIGHT_GRAY);
		textTlf.setBounds(607, 228, 129, 21);
		contentPane.add(textTlf);
		
		JLabel lblFax = new JLabel("Fax:");
		lblFax.setForeground(Color.BLACK);
		lblFax.setFont(new Font("Century Gothic", Font.BOLD, 13));
		lblFax.setBounds(746, 227, 28, 22);
		contentPane.add(lblFax);
		
		textFax = new JTextField();
		textFax.setEditable(false);
		textFax.setColumns(10);
		textFax.setBackground(Color.LIGHT_GRAY);
		textFax.setBounds(807, 227, 115, 22);
		contentPane.add(textFax);
		
		textCiudad = new JTextField();
		textCiudad.setEditable(false);
		textCiudad.setColumns(10);
		textCiudad.setBackground(Color.LIGHT_GRAY);
		textCiudad.setBounds(334, 226, 151, 22);
		contentPane.add(textCiudad);
		
		textNumGuia = new JTextField();
		textNumGuia.setText("4456");
		textNumGuia.setEditable(false);
		textNumGuia.setColumns(10);
		textNumGuia.setBackground(Color.LIGHT_GRAY);
		textNumGuia.setBounds(308, 93, 151, 22);
		contentPane.add(textNumGuia);
		
		JLabel lblCodEncargadoRecepcion = new JLabel("Cod. Encargado Recepcion:");
		lblCodEncargadoRecepcion.setForeground(Color.BLACK);
		lblCodEncargadoRecepcion.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCodEncargadoRecepcion.setBounds(87, 128, 212, 14);
		contentPane.add(lblCodEncargadoRecepcion);
		
		JLabel lblRazSocProv = new JLabel("Raz\u00F3n Social del Prov.:");
		lblRazSocProv.setForeground(Color.BLACK);
		lblRazSocProv.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblRazSocProv.setBounds(468, 155, 186, 19);
		contentPane.add(lblRazSocProv);
		
		JLabel lblRutProveedor = new JLabel("RUT Proveedor:");
		lblRutProveedor.setForeground(Color.BLACK);
		lblRutProveedor.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblRutProveedor.setBounds(87, 153, 101, 24);
		contentPane.add(lblRutProveedor);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEmail.setBounds(642, 184, 64, 22);
		contentPane.add(lblEmail);
		
		textRazSocProv = new JTextField();
		textRazSocProv.setEditable(false);
		textRazSocProv.setColumns(10);
		textRazSocProv.setBackground(Color.LIGHT_GRAY);
		textRazSocProv.setBounds(629, 151, 293, 22);
		contentPane.add(textRazSocProv);
		
		JLabel lblDirProv = new JLabel("Direcci\u00F3n del Proveedor:");
		lblDirProv.setForeground(Color.BLACK);
		lblDirProv.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblDirProv.setBounds(87, 186, 212, 22);
		contentPane.add(lblDirProv);
		
		textEmail = new JTextField();
		textEmail.setEditable(false);
		textEmail.setColumns(10);
		textEmail.setBackground(Color.LIGHT_GRAY);
		textEmail.setBounds(736, 184, 186, 22);
		contentPane.add(textEmail);
		
		textNombreEncargado = new JTextField();
		textNombreEncargado.setEditable(false);
		textNombreEncargado.setColumns(10);
		textNombreEncargado.setBackground(Color.LIGHT_GRAY);
		textNombreEncargado.setBounds(629, 118, 293, 22);
		contentPane.add(textNombreEncargado);
		
		JLabel labelNumGuia = new JLabel("Numero de guia de recepci\u00F3n:");
		labelNumGuia.setForeground(Color.BLACK);
		labelNumGuia.setFont(new Font("Century Gothic", Font.BOLD, 14));
		labelNumGuia.setBounds(87, 93, 212, 24);
		contentPane.add(labelNumGuia);
		
		textFecha = new JTextField();
		textFecha.setEditable(false);
		textFecha.setColumns(10);
		textFecha.setBackground(Color.LIGHT_GRAY);
		textFecha.setBounds(629, 89, 129, 20);
		contentPane.add(textFecha);
		
		
		textDirProv = new JTextField();
		textDirProv.setEditable(false);
		textDirProv.setColumns(10);
		textDirProv.setBackground(Color.LIGHT_GRAY);
		textDirProv.setBounds(308, 184, 318, 21);
		contentPane.add(textDirProv);
		
		textRUTProv = new JTextField();
		textRUTProv.setColumns(10);
		textRUTProv.setBackground(Color.LIGHT_GRAY);
		textRUTProv.setBounds(308, 151, 151, 22);
		contentPane.add(textRUTProv);
		
		JLabel lblEncargado = new JLabel("ENCARGADO:");
		lblEncargado.setForeground(Color.BLACK);
		lblEncargado.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEncargado.setBounds(468, 122, 101, 22);
		contentPane.add(lblEncargado);
		
		JLabel labelFechaDeRecepcion = new JLabel("Fecha de recepci\u00F3n:");
		labelFechaDeRecepcion.setForeground(Color.BLACK);
		labelFechaDeRecepcion.setFont(new Font("Century Gothic", Font.BOLD, 14));
		labelFechaDeRecepcion.setBounds(469, 87, 151, 30);

		
		
		
		textCodEncargadoRecepcion = new JTextField();
		textCodEncargadoRecepcion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Se presiono enter");
			}
		});
		
		textCodEncargadoRecepcion.setBackground(Color.LIGHT_GRAY);
		textCodEncargadoRecepcion.setBounds(308, 123, 151, 20);
		contentPane.add(textCodEncargadoRecepcion);
		textCodEncargadoRecepcion.addFocusListener(new ControlVentanaPrincipal(this,"BuscarEncargado"));
		RestrictedTextField restriEncargado = new RestrictedTextField(textCodEncargadoRecepcion);
		restriEncargado.setOnlyNums(true);
		restriEncargado.setLimit(8);
		
		JLabel lblTitulo = new JLabel("Interfaz Gr\u00E1fica de Usuario");
		lblTitulo.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblTitulo.setBounds(370, 11, 268, 30);
		contentPane.add(lblTitulo);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/6895843-minimal-digital-backgrounds.jpg")));
		lblFondo.setBounds(0, 0, 1072, 691);
		contentPane.add(lblFondo);
	}
}
