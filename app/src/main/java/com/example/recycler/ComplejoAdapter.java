package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ComplejoAdapter extends RecyclerView.Adapter<ComplejoAdapter.ViewHolder> {

    ArrayList<SmartphoneModel> smartphoneModel;

    public ComplejoAdapter(ArrayList<SmartphoneModel> smartphoneModel) {
        this.smartphoneModel = smartphoneModel;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listcomplejo,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.marca.setText(smartphoneModel.get(position).getMarca());
        holder.dimension.setText(smartphoneModel.get(position).getDimension());
        holder.modelo.setText(smartphoneModel.get(position).getModelo());
        holder.anio.setText(smartphoneModel.get(position).getAnio());
    }

    @Override
    public int getItemCount() {

        return smartphoneModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView marca,modelo,dimension,anio;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            marca=itemView.findViewById(R.id.marca);
            modelo= itemView.findViewById(R.id.modelo);
            dimension= itemView.findViewById(R.id.dimension);
            anio=itemView.findViewById(R.id.anio);
        }
    }
}
