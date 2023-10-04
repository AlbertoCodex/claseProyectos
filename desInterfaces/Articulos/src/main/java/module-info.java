module com.politecnico.articulos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.politecnico.articulos to javafx.fxml;
    exports com.politecnico.articulos;
}
