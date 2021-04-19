package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Pimenta nos olhos dos outros é refresco",
                "Quando um burro fala, o outro abaixa a orelha",
                "A pressa é inimiga da perfeição",
                "À noite todos os gatos são pardos",
                "Cão que ladra não morde",
                "Deus ajuda quem cedo madruga",
                "Água mole, pedra dura, tanto bate até que fura",
                "Casa de ferreiro, espeto de pau",
                "Cada macaco no seu galho",
                "O que os olhos não veem, o coração não sente"
        };
        int numero = (int) Math.floor(Math.random() * 10);

        TextView texto = findViewById(R.id.campoFrase);
        texto.setText(frases[numero]);

    }

}
