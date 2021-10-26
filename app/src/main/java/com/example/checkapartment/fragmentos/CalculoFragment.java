package com.example.checkapartment.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.checkapartment.R;
import com.example.checkapartment.databinding.FragmentCalculoBinding;
import com.example.checkapartment.modelo.Departamento;

import java.util.ArrayList;


public class CalculoFragment extends Fragment {

   FragmentCalculoBinding b;
   //private int suma=3,mult=1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        b = FragmentCalculoBinding.inflate(inflater,container,false);

        check();



        Departamento Lista = (Departamento) getArguments().getSerializable("lista");

        b.tvNomEd.setText(Lista.getNombre());
        b.tvDireEd.setText(Lista.getDireccion());

        return b.getRoot();
}


    public  void check() {

        int suma=3,mult=1;

        if (b.cbLuz.isChecked()) {
            suma = +10;
        } else {
            suma = +0;
        }
        if (b.cbBano.isChecked()) {
            suma = +40;
        } else {
            suma = +0;
        }
        if (b.cbCocina.isChecked()) {
            suma = +30;
        } else {
            suma = +0;
        }
        if (b.cbDormitorio.isChecked()) {
            suma = +20;
        } else {
            suma = +0;
        }
        if (b.cbNormal.isChecked()) {
            mult = 3;
        } else if (b.cbRegular.isChecked()) {
            mult = 2;
        } else if (b.cbMala.isChecked()) {
            mult = 1;
        }


        int total = suma * mult;
        b.tvResultado.setText(String.valueOf(total));


    }
}