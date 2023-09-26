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
        int iD1J1 = 0;
        int iD2J1 = 4;

        int iD1J2 = 6;
        int iD2J2 = 2;

        TextView tvResultado = (TextView) this.findViewById(R.id.textView7);
        tvResultado.setText("Ha ganado el jugador: " + String.valueOf(1));
    }
}