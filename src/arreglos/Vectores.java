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

    //metodo para buscar
    public void buscarVector()
    {
        boolean encontrado = false;
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea buscar"));

        for (int i = 0; i < listaNumeros.length; i++)
        {
            if (dato == listaNumeros[i])
            {
                System.out.println("El dato "+dato+" se encuentra en la posicion "+i);
                encontrado = true;
            }
        }

        if (!encontrado)
        {
            System.out.println("El dato no se encuentra en el vector");
        }
    }

    public void reemplazarVector()
    {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea reemplazar"));
        int nuevoDato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo dato"));
        boolean encontrado = false;

        for (int i = 0; i < listaNumeros.length; i++)
        {
            if (dato == listaNumeros[i])
            {
                listaNumeros[i] = nuevoDato;
                encontrado = true;
            }
        }

        if (!encontrado)
            System.out.println("El dato no se encuentra en el vector para ser reemplazado");
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion" +
                "\n1.Agregar \n2.Mostrar \n3.Eliminar \n4.Editar \n5.Buscar \n6.Reemplazar \n0.Salir"));

        switch (opcion)
        {
            case 1:
                agregarVector();
                break;
            case 2:
                mostrarVector();
                break;
            case 3:
                eliminarVector();
                break;
            case 4:
                editarVector();
                break;
            case 5:
                buscarVector();
                break;
            case 6:
                reemplazarVector();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
                break;
        }
        menu();
    }

    public static void main(String[] args) {
        Vectores vectores = new Vectores();
        vectores.menu();
    }
}
