package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import Modelo.MySQL;
import Vista.Ventana;

public  class ControlVentana implements ActionListener{

String cha;
	private Ventana escu;
	  
	    public ControlVentana(Ventana escu, String cha ) {
	    
	        this.escu = escu; // Con esto se maneja el objeto de forma global en
	                          // esta clase.
	        this.cha=cha;
	    }

		
		public void actionPerformed(ActionEvent e) {
			ClassPrincipal q = new ClassPrincipal();
			Datos j =new Datos();
			MySQL Ms=new MySQL();
			/*
	         * Aqui se revisa qué botón se está presionando dependiendo del
	         * ActionCommand que se le puso
	         */
	        if (this.cha.equals("btnRegisEncar")) {
	        	
	        	q.Re.setVisible(true);
	        	q.framero.setVisible(false);
	        	
	        	
	        	
	        	if(Ms.EsisTable("RegistroEncar")==false){
	        	
	        	Ms.MySQLConexion("root","","EjerCom");
	        	Ms.createTable("RegistroEncar");
	        	Ms.closeConexion();
	        	}
	        }
	        
	        if(this.cha.equals("btnRegisProbee")){
	        	
	        	if(Ms.MySQLConexion("root","","EjerCom")==false)
	        	{
	        	Ms.MySQLConexion("root","","");	
	        	Ms.createDB("EjerCom");
	        	
	        	}
	        	
	        	if(Ms.EsisTable("RegistroProbee")==false){
	        	
	        	Ms.MySQLConexion("root","","EjerCom");
	        	Ms.createTable("RegistroProbee");
	        	Ms.closeConexion();
	        	}
	        	
	        }
	        if (this.cha.equals("btnRegisCom")) {
	        	
	        	
				q.fram.setVisible(true);
	        	q.framero.setVisible(false);
	        	
	        	Calendar cal = Calendar.getInstance();
				String fechaString = j.fechaString2(cal);
				q.fram.textFecha.setText(fechaString);
	        }
			
		}
}