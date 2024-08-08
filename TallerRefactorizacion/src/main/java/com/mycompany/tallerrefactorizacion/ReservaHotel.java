/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerrefactorizacion;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit; 

/**
 *
 * @author CltControl
 */
public class ReservaHotel{
    private Cliente Cliente;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    private int cantidadPersonas;
    private Habitacion Habitacion;
    
    public void setCliente(Cliente c){
        this.Cliente = c;
    }
    
    public void setCantidadPersonas(int cant){
        this.cantidadPersonas = cant;
    }
    
    public void setHabitacion(Habitacion h){
        this.Habitacion = h;
    }
    
    public Cliente getCliente(){
        return Cliente;
    }
    
    public int calcularDiasDeReserva(){
     ChronoUnit unidadDeTiempo = ChronoUnit.DAYS;
        return (int) unidadDeTiempo.between(fechaInicio, fechaFin);
    } 
    

    public double calcularCostoReserva()throws ExcepcionCostoReserva{
        if (calcularDiasDeReserva() <= 0){
            throw new ExcepcionCostoReserva("Números fuera del intervalo");
        }
        return Habitacion.getPrecio()* calcularDiasDeReserva();
    }
    
    private Habitacion getHabitacion(){
        return Habitacion;
        }
        
    public void mostrarDetallesReserva() throws ExcepcionCostoReserva{
        System.out.println(Cliente.toString());
        System.out.println("Fechas: "+ fechaInicio +"-"+ fechaFin);
        System.out.println("Cantidad de Personas: " + cantidadPersonas);
        System.out.println("Tipo de Habitación: "+ Habitacion.getTipo());
        System.out.println("Días de Reserva: " + calcularDiasDeReserva());
        System.out.println("Costo: " + calcularCostoReserva());
    }
}
