package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Vista.RegisProd;
import Modelo.MySQL;

public class ControlRegisProd implements ActionListener {
	
	private RegisProd escu;
	private String cha;
	
	public ControlRegisProd(RegisProd escu, String cha){
		this.escu = escu; // Con esto se maneja el objeto de forma global en
							// esta clase.
		this.cha=cha;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ClassPrincipal k = new ClassPrincipal();
		MySQL q = new MySQL();
		if(cha.equals("btnGuardar")){
			
			if (k.wi.textDescr.getText().isEmpty() || k.wi.textPrecio.getText().isEmpty() || k.wi.textProdCod.getText().isEmpty() ){//En ClassPrincipal instancié RegisProd como "wi"
				JOptionPane.showMessageDialog(null, "No puedes dejar espacios vacios", "Error", JOptionPane.ERROR_MESSAGE);
			}else{
				if (q.EsisTable("registroproducto")==false){
					q.MySQLConexion("root", "", "ejercom");
					q.createTableProducto("registroproducto");
					q.closeConexion();	
				}
				q.MySQLConexion("root", "", "ejercom");
				q.InsertData("registroproducto", k.wi.textProdCod.getText() , k.wi.textDescr.getText(), k.wi.textPrecio.getText() );
				q.closeConexion();

			}
			
		}
		
	}
	
	

}
