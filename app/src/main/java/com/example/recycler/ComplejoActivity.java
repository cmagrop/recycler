package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ComplejoActivity extends AppCompatActivity {

    ArrayList<SmartphoneModel> smartphoneModel;
    RecyclerView recycler;
    ComplejoAdapter complejoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complejo);
        smartphoneModel = new ArrayList<>();//crear el ArrayList SmartphoneModel
        recycler=findViewById(R.id.recyclerId2);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        llenarSmartphones();
        complejoAdapter= new ComplejoAdapter(smartphoneModel);
        recycler.setAdapter(complejoAdapter);
    }

    private void llenarSmartphones() {

        smartphoneModel.add(new SmartphoneModel("Samsung","A31S",
                "4'","2020"));
        smartphoneModel.add(new SmartphoneModel("Huawei","P40","6","2019"));
        smartphoneModel.add(new SmartphoneModel("Sony","XF38","7'","2050"));

    }
}