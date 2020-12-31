package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class BasicoAdapter extends RecyclerView.Adapter<BasicoAdapter.ViewHolder>

{
    ArrayList<String> listaDatos;

    public BasicoAdapter(ArrayList<String> listaDatos) {
        this.listaDatos = listaDatos;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listbasico,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
           holder.asignarDatos(listaDatos.get(position));
    }

    @Override
    public int getItemCount() {

        return listaDatos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView item;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item=itemView.findViewById(R.id.itemId);
        }

        public void asignarDatos(String itemDato) {

            item.setText(itemDato);

        }
    }
}
