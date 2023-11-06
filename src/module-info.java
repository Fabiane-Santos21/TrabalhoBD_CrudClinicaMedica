module CrudClinicaMedica {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.sql;
	requires javafx.fxml;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml;
}
