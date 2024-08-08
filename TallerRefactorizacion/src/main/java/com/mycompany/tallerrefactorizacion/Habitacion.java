package com.mycompany.tallerrefactorizacion;

public abstract class Habitacion{
    private String tipo;
    private double precio;
    
    public Habitacion(String tipo, double precio){
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo(){
        return tipo;
    }
    
    public double getPrecio(){
        return precio;
    }
}