package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BasicoActivity extends AppCompatActivity {

    ArrayList<String> listaDatos;
    RecyclerView recycler;
    BasicoAdapter basicoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basico);
        //aqui empieza la accion
        recycler= findViewById(R.id.recyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        listaDatos= new ArrayList<String>();//inicializar listaDatos
        listaDatos.add("Hola");
        listaDatos.add("Mundo");
        listaDatos.add("Feliz");
        basicoAdapter= new BasicoAdapter(listaDatos);
        recycler.setAdapter(basicoAdapter);



    }
}