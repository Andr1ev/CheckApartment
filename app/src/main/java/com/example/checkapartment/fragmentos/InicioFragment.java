package com.example.checkapartment.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.checkapartment.R;
import com.example.checkapartment.adapter.DepartamentoAdapter;
import com.example.checkapartment.databinding.FragmentInicioBinding;
import com.example.checkapartment.databinding.FragmentLoginBinding;
import com.example.checkapartment.modelo.Departamento;

import java.util.ArrayList;


public class InicioFragment extends Fragment {

FragmentInicioBinding b;
//ArrayList<Departamento> listaDep;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        b= FragmentInicioBinding.inflate(inflater,container,false);

        ArrayList<Departamento> Lista = (ArrayList<Departamento>) getArguments().getSerializable("departamento");

     //   listaDep = new ArrayList<>();

        //llenar();

        DepartamentoAdapter adapter = new DepartamentoAdapter(Lista);
        b.rvLista.setLayoutManager(new LinearLayoutManager(getContext()));
        b.rvLista.setAdapter(adapter);



        return b.getRoot();
    }
   /* public void llenar(){
        listaDep.add((new Departamento("Las Palmas",345,"san francisco 345")));
        listaDep.add((new Departamento("Verdece",345,"apoquindo 1036")));
        listaDep.add((new Departamento("Malbec",345,"republica 234")));
        listaDep.add((new Departamento("Livin",345,"portugal 148")));
        listaDep.add((new Departamento("Carrion",345,"alameda 942")));
        }

    */
}