package Modelo;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panel extends JPanel {

ImageIcon imagen;
String nombre;
//Vaina que obtiee algo
	public panel(String nombre) {
		
		
		this.nombre = nombre;

	}
	//Imagen de ventana
	public void paint(Graphics g){
		Dimension tan = getSize();
		imagen = new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(),0,0,tan.width,tan.height,this);
		setOpaque(false);
		super.paint(g);
		
		
	}

}