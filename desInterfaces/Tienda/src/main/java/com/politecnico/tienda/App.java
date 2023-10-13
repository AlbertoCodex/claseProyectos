package com.politecnico.tienda;

import javafx.scene.Parent;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import com.politecnico.tienda.Articulo;
import java.io.IOException;
import java.net.URL;
import java.io.IOException;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage escenarioPrincipal;
    private BorderPane vistaPrincipal;
    private ObservableList datosArticulo = FXCollections.observableArrayList();
    private AnchorPane vistaArticulos;
    
    // Datos ejemplo -- Continue

    public App() {
        datosArticulo.add(new Articulo("Codigo", "Descripcion", "Fabricante", "Categoria", 0));
        datosArticulo.add(new Articulo("1234", "aaaaa", "BMW", "Coche", 300));
        datosArticulo.add(new Articulo("1111", "bbbbb", "VIC", "Boligrafo", 0));
        datosArticulo.add(new Articulo("2131", "ccccc", "Pascual", "Leche", 0));
        datosArticulo.add(new Articulo("5435", "ddddd", "Raton", "Animal", 0));;
        
    }
    
    @Override
    public void start(Stage stage) throws IOException {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioPrincipal.setTitle("Lista de articulos");
        initLayoutPrincipal();
        muestraVistaArticulo();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
    private void initLayoutPrincipal() {
        FXMLLoader loader = new FXMLLoader();
        URL location = App.class.getResource("xml/principal.fxml");
        loader.setLocation(location);
        try {
            vistaPrincipal = loader.load();
        } catch (IOException ex) {
            
        }
        
        Scene escena = new Scene(vistaPrincipal);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }
    
    public void muestraVistaArticulo(){
        FXMLLoader loader = new FXMLLoader();
        URL location = App.class.getResource("fxml/articulos.fxml");
        loader.setLocation(location);
        try {
            vistaArticulos = loader.load();
        } catch (IOException ex) {
            
        }
        vistaPrincipal.setCenter(vistaArticulos);
    }
    
    public ObservableList getDatosArticulo() {
        return datosArticulo;
    }

    public Stage getPrimaryStage() {
        return escenarioPrincipal;
    }
    

}