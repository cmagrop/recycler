package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void accederBasico(View view) {

        Intent acceder= new Intent(this,BasicoActivity.class);
        startActivity(acceder);

    }

    public void accederComplejo(View view) {

        Intent acceder= new Intent(this,ComplejoActivity.class);
        startActivity(acceder);

    }
}