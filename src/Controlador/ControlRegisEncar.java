package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import Modelo.MySQL;
import Vista.RegisEncar;

public  class ControlRegisEncar implements ActionListener, MouseListener{


	private RegisEncar escu;
	private String cha;
	
	    public ControlRegisEncar(RegisEncar escu, String cha) {
	    
	        this.escu = escu; // Con esto se maneja el objeto de forma global en
	                          // esta clase.
	        this.cha=cha;
	    }

	
		public void actionPerformed(ActionEvent arg0) {
			
			
			ClassPrincipal q = new ClassPrincipal();
			if(this.cha.equals("btnRegistrar")){
				
				if (q.Re.textID.getText().isEmpty() || q.Re.textNom.getText().isEmpty() || q.Re.textApell.getText().isEmpty()){
					JOptionPane.showMessageDialog(escu, "No puedes dejar espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
			
			MySQL Ms=new MySQL();
			Ms.MySQLConexion("root","","EjerCom");
			Ms.InsertData("RegistroEncar", q.Re.textID.getText(), q.Re.textNom.getText(), q.Re.textApell.getText());
			q.Re.textID.setText("");
			q.Re.textNom.setText("");
			q.Re.textApell.setText("");
			q.Re.setVisible(false); 
			q.fram.setVisible(true);
			Ms.closeConexion();
			}
			}
		}


		
		public void mouseClicked(MouseEvent arg0){
		

			ClassPrincipal q = new ClassPrincipal();
			if(this.cha.equals("AtrasRegistrar"))
			{
			q.Re.setVisible(false); 
			q.framero.setVisible(true);
			}
			
		}


		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
}