package com.politecnico.dados2023.model;

public class Jugador {
    private Tirada tirada;

    private int iSeis;
    public Jugador() {
        tirada = new Tirada();
        iSeis = tirada.getiSeis();
    }
    public void tirada() {
        tirada.tirarDados();
    }
    public Tirada getTirada() {
        return tirada;
    }
    public void setTirada(Tirada tirada) {
        this.tirada = tirada;
    }

    public int getiSeis() {
        return iSeis;
    }

    public void setiSeis(int iSeis) {
        this.iSeis = iSeis;
    }
}
