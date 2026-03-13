package arreglos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Arrays
{
    //Creacion de arrayList
    List<Integer> listaNumero = new ArrayList<>();

    //Metodo para imprimir
    public void imprimir1()
    {
        for (int i = 0; i < listaNumero.size(); i++)
        {
            System.out.println(listaNumero.get(i));
        }
    }

    public void imprimir2()
    {
        for (int numero: listaNumero)
        {
            System.out.println(numero);
        }
    }

    //Metodo para agregar
    public void agregar()
    {
        int op = 0;
        do
        {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            listaNumero.add(numero);
            op = JOptionPane.showConfirmDialog(null,"Desea continuar?");

        }while (op == 0);
    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.agregar();
        arrays.imprimir1();
        arrays.imprimir2();
    }
}
