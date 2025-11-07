package com.example.practica_5_listas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView listaEjemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEjemplo = findViewById(R.id.listaEjemplo);

        // Crear lista de elementos
        ArrayList<Films> elementos = new ArrayList<>();
        elementos.add(new Films("Avatar", "avatar"));
        elementos.add(new Films("Matrix", "matrix"));
        elementos.add(new Films("Inception", "inception"));
        elementos.add(new Films("Interstellar", "interstellar"));
        elementos.add(new Films("The Dark Knight", "thedarkknight"));
        elementos.add(new Films("Titanic", "titanic"));
        elementos.add(new Films("Gladiator", "gladiator"));
        elementos.add(new Films("Jurassic Park", "jurassicpark"));

        // Configurar RecyclerView
        listaEjemplo.setHasFixedSize(true);
        listaEjemplo.setLayoutManager(new LinearLayoutManager(this));

        // Configurar adaptador
        AdaptadorEjemplo adaptador = new AdaptadorEjemplo(this, elementos);
        listaEjemplo.setAdapter(adaptador);
    }
}