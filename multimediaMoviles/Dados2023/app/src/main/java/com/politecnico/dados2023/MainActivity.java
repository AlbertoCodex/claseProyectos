package com.politecnico.dados2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playGame(View v) {
        int iJ1D1 = (int) (Math.random()*6+1);
        int iJ1D2 = (int) (Math.random()*6+1);
        int iSeis1 = 0;
        int iJ2D1 = (int) (Math.random()*6+1);
        int iJ2D2 = (int) (Math.random()*6+1);
        int iSeis2 = 0;
        TextView tvResultado = (TextView) this.findViewById(R.id.tvResultado);

        if (iJ1D1 == 6) {iSeis1++;}
        if (iJ1D2 == 6) {iSeis1++;}
        if (iJ2D1 == 6) {iSeis2++;}
        if (iJ2D2 == 6) {iSeis2++;}
        if (iSeis1 > iSeis2) { tvResultado.setText("Jugador 1");
        } else if (iSeis1 < iSeis2) {tvResultado.setText("Jugador 2");}
        else if (iSeis1 == iSeis2) {tvResultado.setText("Empate");}
        else {
            // Falta cuando la suma son iguales
            if (iJ1D1 + iJ1D2 > iJ2D1 + iJ2D2) {tvResultado.setText("Jugador 1");}
            else {tvResultado.setText("Jugador 2");}
        }

    }
}