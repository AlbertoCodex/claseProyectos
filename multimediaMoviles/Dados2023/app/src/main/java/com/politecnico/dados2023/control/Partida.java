package com.politecnico.dados2023.control;

import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.politecnico.dados2023.R;
import com.politecnico.dados2023.MainActivity;
import com.politecnico.dados2023.model.Jugador;
import com.politecnico.dados2023.model.Tirada;

public class Partida extends AppCompatActivity  {
    Jugador j1;
    Jugador j2;

    public Partida() {
        j1 = new Jugador();
        j2 = new Jugador();
    }

    public void playGame(Jugador j1, Jugador j2) {
        int iJ1D1 = j1.getTirada().getD1().getValue();
        int iJ1D2 = j1.getTirada().getD2().getValue();
        int iSeis1 = j1.getiSeis();
        int iJ2D1 = j2.getTirada().getD1().getValue();
        int iJ2D2 = j2.getTirada().getD2().getValue();
        int iSeis2 = j2.getiSeis();
        TextView tvResultado = (TextView) this.findViewById(R.id.tvResultado);
        TextView tvJ1D1 = (TextView) this.findViewById(R.id.tvJ1D1);
        TextView tvJ1D2 = (TextView) this.findViewById(R.id.tvJ1D2);
        TextView tvJ2D1 = (TextView) this.findViewById(R.id.tvJ2D1);
        TextView tvJ2D2 = (TextView) this.findViewById(R.id.tvJ2D2);

        // Pasar int to string
        tvJ1D1.setText(String.valueOf(iJ1D1));
        tvJ1D2.setText(String.valueOf(iJ1D2));
        tvJ2D1.setText(String.valueOf(iJ2D1));
        tvJ2D2.setText(String.valueOf(iJ2D2));

        if (iSeis1 > iSeis2) { tvResultado.setText("Jugador 1");}
        else if (iSeis1 == iSeis2 && iSeis1 == 2) {tvResultado.setText("Empate");}
        else {tvResultado.setText("Jugador 2");}

        if(iSeis1 == 1 && iSeis2 == 1) {
            if (iJ1D1 + iJ1D2 > iJ2D1 + iJ2D2) {tvResultado.setText("Jugador 1");}
            else if (iJ1D1 + iJ1D2 == iJ2D1 + iJ2D2) {tvResultado.setText("Empate");}
            else {tvResultado.setText("Jugador 2");}
        }

        if(iSeis1 == 0 && iSeis2 == 0) {
            if (iJ1D1 + iJ1D2 > iJ2D1 + iJ2D2) {tvResultado.setText("Jugador 1");}
            else if (iJ1D1 + iJ1D2 == iJ2D1 + iJ2D2) {tvResultado.setText("Empate");}
            else {tvResultado.setText("Jugador 2");}
        }
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
