package com.politecnico.articulos;

import javafx.scene.Parent;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Articulo;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private ObservableList datosArticulo = FXCollections.observableArrayList();
    private AnchorPane vistaArticulo;
    
    // Datos ejemplo -- Continue

    public App() {
        datosArticulo.add(new Articulo("", "", "", "", 0));
        datosArticulo.add(new Articulo("", "", "", "", 0));
        datosArticulo.add(new Articulo("", "", "", "", 0));
        datosArticulo.add(new Articulo("", "", "", "", 0));
        datosArticulo.add(new Articulo("", "", "", "", 0));;
    }
    

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("articulos"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
        
    }

}