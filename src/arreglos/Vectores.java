package arreglos;

import javax.swing.*;

public class Vectores
{
    //Creacion de vector
    int[] listaNumeros = new int[10];

    //Metodos para imprimir el vector
    public void mostrarVector()
    {
        for (int i = 0; i < listaNumeros.length; i++)
        {
            System.out.println(listaNumeros[i]);
        }
    }

    //Metodo para agregar valores al vector
    public void agregarVector()
    {
        for (int i = 0; i < listaNumeros.length; i++)
        {
            listaNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato ["+i+"]"));
        }
    }

    //Metodo para eliminar
    public void eliminarVector()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el posicion del vector"));
        listaNumeros[posicion] = 0;
    }

    //metodo para editar
    public void editarVector()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el posicion del vector"));
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero con el que se modificara"));
        listaNumeros[posicion] = dato;
    }

    public static void main(String[] args) {
        Vectores vectores = new Vectores();
        vectores.agregarVector();
        vectores.eliminarVector();
        vectores.mostrarVector();
    }
}
