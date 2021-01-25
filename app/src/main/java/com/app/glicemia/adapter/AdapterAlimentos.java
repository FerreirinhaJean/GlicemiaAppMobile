package com.app.glicemia.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.glicemia.R;
import com.app.glicemia.model.entities.Alimento;

import java.util.List;

public class AdapterAlimentos extends RecyclerView.Adapter<AdapterAlimentos.MyViewHolder> {

    private List<Alimento> listAlimentos;
    private Context context;

    public AdapterAlimentos(List<Alimento> listAlimentos, Context context) {
        this.listAlimentos = listAlimentos;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_alimento, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listAlimentos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nomeAlimento;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeAlimento = itemView.findViewById(R.id.tvAdapterAlimento);

        }
    }

}
