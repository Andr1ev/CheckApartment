package com.example.checkapartment.modelo;

import java.io.Serializable;

public class Departamento implements Serializable {

    private String nombre;
    private int numero;
    private String direccion;

    public Departamento() {
    }

    public Departamento(String nombre, int numero, String direccion) {
        this.nombre = nombre;
        this.numero = numero;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
