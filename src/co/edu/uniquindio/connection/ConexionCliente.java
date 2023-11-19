package co.edu.uniquindio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class ConexionCliente {


	private final String stringConexion = "jdbc:oracle:thin:@localhost:1521:xe";
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private Connection cx;
	private String usr = "PROYECTO_TURISMO_CLIENTE";
	private String passwd = "1234";
	private Statement statement;
	private ResultSet resultSet;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConexionCliente conexion  = new ConexionCliente();
		try {
			conexion.conectar();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ConexionCliente(){

	}

	public Connection conectar() throws ClassNotFoundException{



		try{
			Class.forName(driver);
			cx = DriverManager.getConnection(stringConexion, usr, passwd);
			JOptionPane.showMessageDialog(null, "Conexion establecida");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Conexion no establecida");
		}
		return cx;
	}


//	public ArrayList<TipoProceso> listaTipoProceso()
//	{
//
//    	ArrayList<TipoProceso> listaTipoProceso = new ArrayList<>();
//    	TipoProceso tipoProceso = new TipoProceso();
//
//		try {
//			statement = cx.createStatement();
//			//consulta b�sica
//			resultSet = statement.executeQuery("SELECT * FROM \"TIPO-PROCESO\"");
//
//			//recorrer la consulta
//			while (resultSet.next()) {
//				tipoProceso.setNombre(resultSet.getString("NOMBRE"));
//				listaTipoProceso.add(tipoProceso);
//				//tipoProceso = new TipoProceso();
//
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return listaTipoProceso;
//    }

}
