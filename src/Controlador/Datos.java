package Controlador;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Vista.VentanaPrincipal;

import java.text.SimpleDateFormat;
import java.util.*;

public class Datos {
	
	static int guia = 42069; //42069 como inicio de numero de guia, podia poner 1 pero me parecia mejor poner 420 (Prendelo) y 69
	Calendar calendario = Calendar.getInstance();
	public String fecha;
	int anno = calendario.get(Calendar.YEAR);
	int mes = calendario.get(Calendar.MONTH);
	int dia = calendario.get(Calendar.DAY_OF_MONTH);
	String[][]matriz={};
	String[]vector={"L.","Codigo","Descripcion","Precio","Cantidad","Valor Neto"};
	public DefaultTableModel modelo = new DefaultTableModel(matriz,vector);
	
	//Uso de la fecha con objeto calendar
	public String fechaString(Calendar fecha){
		String retorno = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		if (fecha != null){
			retorno = sdf.format(fecha.getTime());
		}
		return retorno;
	}
	
	Calendar fechaCalendar(String fecha){
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		try{
			cal.setTime(sdf.parse(fecha));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de formato de fecha: "+ e);
		}
		return cal;
	}
	
		public void getFechaSistema(){
			VentanaPrincipal q = new VentanaPrincipal();
			Calendar cal = Calendar.getInstance();
			String fechaString = fechaString(cal);
			q.textFecha.setText(fechaString);
		}
		
		public String fechaString2(Calendar fecha) {
			// Metodo para la fecha
			String retorno = null;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
			if (fecha != null){
				retorno = sdf.format(fecha.getTime());
			}
			return retorno;
		}

	

}
