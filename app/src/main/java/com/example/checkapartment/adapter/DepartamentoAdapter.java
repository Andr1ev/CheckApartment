package com.example.checkapartment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checkapartment.R;
import com.example.checkapartment.databinding.ItemLayoutBinding;
import com.example.checkapartment.modelo.Departamento;

import java.util.ArrayList;

public class DepartamentoAdapter extends RecyclerView.Adapter<DepartamentoAdapter.CustomViewHolder>{

    private ArrayList<Departamento> Lista;
    private OnClickListener listener;


    public DepartamentoAdapter(ArrayList<Departamento> lista) {
        this.Lista = lista;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new CustomViewHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(Lista.get(position));
    }

    @Override
    public int getItemCount() {
        return Lista.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        ItemLayoutBinding b;
        OnClickListener listener;

        public CustomViewHolder(@NonNull View itemView, OnClickListener listener) {
            super(itemView);
            b= ItemLayoutBinding.bind(itemView);
            this.listener=listener;

        }

        public void bindData(Departamento dep){
            b.tvNombre.setText(dep.getNombre());
            b.tvNumero.setText(String.valueOf(dep.getNumero()));
            b.tvDireccion.setText(dep.getDireccion());

            itemView.setOnClickListener(v -> {
                listener.onDepartamentoClick(dep);
            });

        }
    }

    public interface OnClickListener{
        void onDepartamentoClick(Departamento dep);
    }

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }
}
