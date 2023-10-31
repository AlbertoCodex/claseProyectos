package com.politecnico.dados2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.politecnico.dados2023.model.Jugador;
import com.politecnico.dados2023.control.Partida;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jugar() {
        Partida partida = new Partida();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        partida.playGame(j1, j2);
    }
}