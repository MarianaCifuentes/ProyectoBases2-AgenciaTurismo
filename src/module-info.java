module co.edu.uniquindio.proyectoBases2 {
	requires javafx.controls;
	requires java.sql;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
