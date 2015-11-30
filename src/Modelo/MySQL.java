package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;



import Vista.VentanaPrincipal;







public class MySQL {
	
	private static Connection Conexion;
	static VentanaPrincipal j = new VentanaPrincipal();
	
	 public boolean MySQLConexion(String User, String Pass, String Nom) {
		 boolean a=true;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Nom, User, Pass);
	            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException ex) {
	        	
	        	a=false;
	        	 System.out.println("error al craear base de dato");
	        }
	        return a;
	    }
	 
	 public void closeConexion() {
	        try {
	            Conexion.close();
	            System.out.println("Se ha finalizado la conexión con el servidor");
	        } catch (SQLException ex) {
	            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	 
	 public void InsertData(String NomTable, String ID, String Nom, String Apell) {
	        try {
	            String Query = "INSERT INTO " + NomTable + " VALUES("
	                    + "\"" + ID + "\", "
	                    + "\"" + Nom + "\", "
	                    + "\"" + Apell + "\")";
	               
	            Statement st = Conexion.createStatement();
	            st.executeUpdate(Query);
	            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
	        }
	    }
	 
	// Metodo que se le deve mandar el id del encargado de reseccion y retorna el nombre y apellido del mismo
	
	public String Consultat(String consul) {
		
		 String tem=null;
		 try {
	            String Query = "SELECT * FROM registroencar";
	            Statement st = Conexion.createStatement();
	            java.sql.ResultSet resultSet;
	            resultSet = st.executeQuery(Query);
	 
	            while (resultSet.next()) {
	            	
	            	if(resultSet.getString("Codigo").equals(consul)){
	           
	                tem =( resultSet.getString("Nombre") + " " + resultSet.getString("Apellido"));
	             
	            	}
	            }
	 
	        } catch (SQLException ex) {
	            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
	        }
		
		return tem;
	}
	
    public void deleteRecord(String table_name, String CODIGO) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE Codigo = \"" + CODIGO + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
    }
    
    public void createDB(String name) {
        try {
        	 Class.forName("com.mysql.jdbc.Driver");
            
            String Query = "CREATE DATABASE " + name;
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            closeConexion();
            
            JOptionPane.showMessageDialog(null, "Se ha creado la base de datos " + name + " de forma exitosa");
        } catch (SQLException ex) {
        	JOptionPane.showMessageDialog(null, "Error boicado");
        	Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
 
    public void createTable(String name) {
        try {
            String Query = "CREATE TABLE " + name + ""
            		+ "(Codigo VARCHAR(25),Nombre VARCHAR(50), Apellido VARCHAR(50))";
            		
            JOptionPane.showMessageDialog(null, "Se ha creado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void createTableProducto(String name) {
        try {
            String Query = "CREATE TABLE " + name + ""
            		+ "(Codigo VARCHAR(25),Descripcion VARCHAR(50), Precio VARCHAR(50))";
            		
            JOptionPane.showMessageDialog(null, "Se ha creado la base de tabla " + name + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean EsisTable(String tab){
    	boolean es=true; 
    	 try {
    		 	MySQLConexion("root", "", "EjerCom");
	            String Query = "SELECT * FROM " + tab;
	            Statement st = Conexion.createStatement();
	            java.sql.ResultSet resultSet;
	            st.executeQuery(Query);
	            closeConexion();
	 
	         
	 
	        } catch (SQLException ex) {
	        	es = false;
	            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
	            closeConexion();
	        }
    	return es;
    }
    
   
	
	 
}

