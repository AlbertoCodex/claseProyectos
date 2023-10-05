package com.politecnico.dados2023.model;

public class Tirada {
    private Dado d1;
    private Dado d2;
    private int iSeis;

    public Tirada() {
        d1 = new Dado();
        d2 = new Dado();
        iSeis = 0;
    }
    public void tirarDados() {
       d1.setValue((int) (Math.random()*6+1));
       if (d1.getValue() == 6) {setiSeis(+1);}
       d2.setValue((int) (Math.random()*6+1));
       if (d2.getValue() == 6) {setiSeis(+1);}
    }
    public Dado getD1() {
        return d1;
    }
    public void setD1(Dado d1) {
        this.d1 = d1;
    }
    public Dado getD2() {
        return d2;
    }
    public void setD2(Dado d2) {
        this.d2 = d2;
    }
    public int getiSeis() {
        return iSeis;
    }

    public void setiSeis(int iSeis) {
        this.iSeis = iSeis;
    }
}
