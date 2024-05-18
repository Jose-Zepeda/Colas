package org.example.colas;

public class ColaLineal
{
    private static final int MAXTAMQ = 39;
    protected int frente;
    protected int fin;
    protected Object[] listaCola;

    public ColaLineal()
    {
        frente = 0;
        fin = -1;
        listaCola = new Object[MAXTAMQ];
    }

    public boolean colaVacia()
    {
        return frente > fin;
    }

    public boolean colaLlena()
    {
        return fin == MAXTAMQ - 1;
    }

    public void insertar(Object elemento) throws Exception
    {
        if(!colaLlena())
        {
            listaCola[++fin] = elemento;
        }
        else
        {
            throw new Exception("Overflow en la cola");
        }
    }

    public Object quitar() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente++];
        }
        else
        {
            throw new Exception("Cola vacía");
        }
    }

    public void borrarCola()
    {
        frente = 0;
        fin = -1;
    }

    public Object frenteCola() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente];
        }
        else
        {
            throw new Exception("Cola vacía");
        }
    }
}
