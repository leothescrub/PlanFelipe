package Controlador;

import java.awt.EventQueue;

import Modelo.MySQL;
import Vista.RegisEncar;
import Vista.RegisProd;
//import Vista.TestVentana;
import Vista.Ventana;
import Vista.VentanaPrincipal;

public class ClassPrincipal {
	
	static Ventana framero = new Ventana();
	static VentanaPrincipal fram = new VentanaPrincipal();
	static RegisEncar Re = new RegisEncar();
	static RegisProd wi = new RegisProd();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				Datos j =new Datos();
				MySQL Ms=new MySQL();
				fram.setVisible(true);
				
				if(Ms.MySQLConexion("root","","EjerCom")==false)
	        	{
	        	Ms.MySQLConexion("root","","");	
	        	Ms.createDB("EjerCom");
	        	
	        	}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}

