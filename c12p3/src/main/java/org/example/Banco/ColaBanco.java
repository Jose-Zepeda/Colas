package org.example.Banco;

import java.util.LinkedList;
import java.util.Queue;

public class ColaBanco
{
    private Queue<Cliente> filaClientes;
    private int capacidadMaxima;

    public ColaBanco(int MaxCapacity)
    {
        this.filaClientes = new LinkedList<>();
        this.capacidadMaxima = MaxCapacity;
    }

    public void agregarCliente(Cliente cliente)
    {
        if(filaClientes.size() < capacidadMaxima)
        {
            filaClientes.offer(cliente);//inserta un cliente a la cola
            System.out.println("Cliente " + cliente.getNombre()+" se ha unido a la fila");
        }
        else
        {
            System.out.println("La cola esta llena");
        }
    }

    public Cliente atenderSiguienteCliente()
    {
        if(!filaClientes.isEmpty())
        {
            Cliente clienteAtendido = filaClientes.poll();
            System.out.println("Atendiendo a: " + clienteAtendido.getNombre());
            return clienteAtendido;
        }
        else
        {
            System.out.println("No hay clientes en la fila");
            return null;
        }
    }

    public int cantidadClientesEnFila()
    {
        return filaClientes.size();
    }
}
