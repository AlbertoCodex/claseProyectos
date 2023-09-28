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
        TextView tvJ1D1 = (TextView) this.findViewById(R.id.tvJ1D1);
        TextView tvJ1D2 = (TextView) this.findViewById(R.id.tvJ1D2);
        TextView tvJ2D1 = (TextView) this.findViewById(R.id.tvJ2D1);
        TextView tvJ2D2 = (TextView) this.findViewById(R.id.tvJ2D2);

        // Pasar int to string
        tvJ1D1.setText(String.valueOf(iJ1D1));
        tvJ1D2.setText(String.valueOf(iJ1D2));
        tvJ2D1.setText(String.valueOf(iJ2D1));
        tvJ2D2.setText(String.valueOf(iJ2D2));

        if (iJ1D1 == 6) {iSeis1++;}
        if (iJ1D2 == 6) {iSeis1++;}
        if (iJ2D1 == 6) {iSeis2++;}
        if (iJ2D2 == 6) {iSeis2++;}
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
}