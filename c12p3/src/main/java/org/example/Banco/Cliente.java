package org.example.Banco;

import java.util.Random;

public class Cliente
{
    private String nombre;
    private int tiempoAtencion;

    //Constructor, obtiene el nombre del cliente y genera un numero aleatorio
    public Cliente(String nombre)
    {
        this.nombre = nombre;
        Random rand = new Random();
        this.tiempoAtencion = rand.nextInt(10) + 1;
    }
    public String getNombre() {return nombre;}
    public int getTiempoAtencion() {return tiempoAtencion;}
    @Override
    public String toString()
    {
        return "Cliente{ nombre=" + nombre + ", Tiempo de atencion: " + tiempoAtencion+" minutos}";
    }
}
