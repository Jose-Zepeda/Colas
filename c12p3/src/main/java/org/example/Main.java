package org.example;
import org.example.colas.ColaLineal;

public class Main
{
    public static void main(String[] args)
    {
        ColaLineal cola = new ColaLineal();
        try
        {
//for (int i = 0; i < 100; i++)
//{
//    cola.insertar(i);
//}

            cola.insertar("Carlos");
            cola.insertar(3);
            cola.insertar("Andrea");
            cola.insertar(3.5);

            System.out.println("Primer elemento de la cola: " + cola.frenteCola());
            //quitar elementos
            while  (!cola.colaVacia())
            {
                System.out.println("Elemento quitado: " + cola.quitar());
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}