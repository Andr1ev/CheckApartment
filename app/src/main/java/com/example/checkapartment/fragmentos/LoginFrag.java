package com.example.checkapartment.fragmentos;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.checkapartment.R;
import com.example.checkapartment.databinding.FragmentLoginBinding;


public class LoginFrag extends Fragment {

FragmentLoginBinding b;
    int cont=3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        b= FragmentLoginBinding.inflate(inflater,container,false);


        b.btnLogin.setOnClickListener(v -> {
            b.etUsuario.setError(null);
            b.etPass.setError(null);

            String mail = b.etUsuario.getEditText().getText().toString();
            String pass = b.etPass.getEditText().getText().toString();



           if (cont>0){
                if (mail.isEmpty()) {
                    b.etUsuario.setError("Ingrese un correo");

                }  if (pass.isEmpty()) {
                    b.etPass.setError("Ingrese una contraseña");

                }
                 if (!mail.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")){
                    b.etUsuario.setError("Correo no valido");

                }
                 if (mail.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$") && (pass.equals("123Pass"))) {
                    Navigation.findNavController(v).navigate(R.id.action_loginFrag_to_inicioFragment2);
                } else {
                    cont--;
                    Toast.makeText(getActivity(),"tiene "+cont+" intentos restantes", Toast.LENGTH_SHORT).show();
                }


            }

            if (cont==0){
                b.btnLogin.setVisibility(View.INVISIBLE);
                Toast.makeText(getActivity(),"debe reiniciar la app y volver a intentar", Toast.LENGTH_SHORT).show();
            }
        });


        return b.getRoot();
    }
}