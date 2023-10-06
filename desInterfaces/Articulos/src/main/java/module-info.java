module com.politecnico.articulos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    
    exports fxml;
    opens fxml to javafx.fxml;
    opens com.politecnico.articulos to javafx.fxml;
    exports com.politecnico.articulos;
}
