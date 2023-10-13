/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnico.tienda;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Alberto
 */
public class Articulo {

    private final StringProperty codigo;
    private final StringProperty descripcion;
    private final StringProperty fabricante;
    private final StringProperty categoria;
    private final IntegerProperty precio;

    public Articulo(String codigo, String descripcion, String fabricante,
            String categoria, int precio) {
        this.codigo = new SimpleStringProperty(codigo);
        this.descripcion = new SimpleStringProperty(descripcion);
        this.fabricante = new SimpleStringProperty(fabricante);
        this.categoria = new SimpleStringProperty(categoria);
        this.precio = new SimpleIntegerProperty(precio);
    }

    public StringProperty getCodigoProperty() {
        return codigo;
    }
    
    public String getCodigo() {
        return codigo.get();
    }

    public StringProperty getDescripcionProperty() {
        return descripcion;
    }
    
    public String getDescripcion() {
        return descripcion.get();
    }

    public StringProperty getFabricanteProperty() {
        return fabricante;
    }
    
    public String getFabricante() {
        return fabricante.get();
    }

    public StringProperty getCategoriaProperty() {
        return categoria;
    }
    
    public String getCategoria() {
        return categoria.get();
    }

    public IntegerProperty getPrecioProperty() {
        return precio;
    }
    
    public int getPrecio() {
        return precio.get();
    }

}

