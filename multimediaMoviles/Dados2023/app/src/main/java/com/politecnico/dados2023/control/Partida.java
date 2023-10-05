package com.politecnico.dados2023.control;

import com.politecnico.dados2023.model.Jugador;

public class Partida {
    Jugador j1;
    Jugador j2;

    public Partida() {
        j1 = getJ1();
        j2 = getJ2();
    }

    public void newPartida(Jugador j1, Jugador j2) {
        j1.tirada();
        j2.tirada();

        // Continue -- Comprobar seises y demas logica
        j1.getiSeis();
        j2.getiSeis();
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }
}
