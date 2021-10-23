package com.example.checkapartment.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.checkapartment.R;
import com.example.checkapartment.databinding.FragmentLoginBinding;
import com.example.checkapartment.modelo.Departamento;

import java.util.ArrayList;


public class InicioFragment extends Fragment {

FragmentLoginBinding b;
ArrayList<Departamento> listaDep;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        b= FragmentLoginBinding.inflate(inflater,container,false);

        //ArrayList<Departamento> Lista = (ArrayList<Departamento>)

        listaDep = new ArrayList<>();






        return b.getRoot();
    }
}