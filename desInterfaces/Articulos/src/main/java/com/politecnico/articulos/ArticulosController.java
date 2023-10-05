/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.politecnico.articulos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author Alberto
 */
public class ArticulosController implements Initializable {


    @FXML
    private TableView<?> tablaDatos;
    @FXML
    private TableColumn<?, ?> columnaCodigo;
    @FXML
    private TableColumn<?, ?> columnaDescripcion;
    @FXML
    private TableColumn<?, ?> columnaFabricante;
    @FXML
    private TableColumn<?, ?> columnaCategoria;
    @FXML
    private Button nuevoArticulo;
    @FXML
    private Button editarArticulo;
    @FXML
    private Button borrarArticulo;
    @FXML
    private TextField codigoText;
    @FXML
    private TextArea descripcionText;
    @FXML
    private TextField fabricanteText;
    @FXML
    private TextField categoriaText;
    @FXML
    private TextField precioText;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void nuevoArticulo(ActionEvent event) {
    }

    @FXML
    private void editarArticulo(ActionEvent event) {
    }

    @FXML
    private void borrarArticulo(ActionEvent event) {
    }

}
