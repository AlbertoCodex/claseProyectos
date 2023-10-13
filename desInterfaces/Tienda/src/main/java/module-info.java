module com.politecnico.tienda {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.politecnico.tienda to javafx.fxml;
    exports com.politecnico.tienda;
}
