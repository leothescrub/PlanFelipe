package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;






import Modelo.MySQL;
import Vista.VentanaPrincipal;

public  class ControlVentanaPrincipal implements ActionListener, FocusListener, MouseListener{


	private VentanaPrincipal escu;
	private String cha;

	    public ControlVentanaPrincipal(VentanaPrincipal escu,String cha) {
	    
	        this.escu = escu; // Con esto se maneja el objeto de forma global en
	                          // esta clase.
	        this.cha=cha;
	       
	    }

	
		public void actionPerformed(ActionEvent e) {
			ClassPrincipal q = new ClassPrincipal();
				Datos j =new Datos();
				MySQL Ms=new MySQL();
			if(this.cha.equals("AgreEncar")){
				
				q.Re.setVisible(true);
	        
	        	if(Ms.EsisTable("RegistroEncar")==false){
		        	
		        	Ms.MySQLConexion("root","","EjerCom");
		        	Ms.createTable("RegistroEncar");
		        	Ms.closeConexion();
		        	}
			}
			if(this.cha.equals("AgreProbee")){
			}
			
			if (this.cha.equals("mntmAgregar_2")){
				q.wi.setVisible(true);
			}
			
			if (this.cha.equals("btnProcesar")){
				System.out.println("Pa despues");
			}
		}
		public void focusLost(FocusEvent arg0) {
			
			if(this.cha.equals("BuscarEncargado"))
			{			
			ClassPrincipal y = new ClassPrincipal();
			MySQL q = new MySQL();
			q.MySQLConexion("root","","EjerCom");// se crea la conexion
			y.fram.textNombreEncargado.setText(q.Consultat(y.fram.textCodEncargadoRecepcion.getText()));//se obtiene el retorno tipo string q contiene este metodo y se muestra en el text 
			q.closeConexion();//se sierra la conexion
			}
		}
	    
		
		
		public void mouseClicked(MouseEvent e) {
		
			if(this.cha.equals("flechaAtras"))
			{
			ClassPrincipal q = new ClassPrincipal();
			q.fram.setVisible(false);
			q.framero.setVisible(true);
			}
		}

		
		
		
		
		
		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


		
		
}
