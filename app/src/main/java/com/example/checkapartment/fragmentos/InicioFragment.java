package com.example.checkapartment.fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
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


        DepartamentoAdapter adapter = new DepartamentoAdapter(Lista);
        b.rvLista.setLayoutManager(new LinearLayoutManager(getContext()));
        b.rvLista.setAdapter(adapter);

        //despues del listener
        adapter.setListener(dep -> {
            Bundle bundle= new Bundle();
            bundle.putSerializable("lista", dep);
            Navigation.findNavController(container).navigate(R.id.action_inicioFragment_to_calculoFragment,bundle);
            //Navigation.findNavController(dep).navigate(R.id.action_inicioFragment_to_calculoFragment,bundle);
        });

        return b.getRoot();
    }

}