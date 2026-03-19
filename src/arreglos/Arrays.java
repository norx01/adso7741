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

    public void eliminar()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del valor a eliminar"));
        listaNumero.remove(posicion);
    }

    public void editar()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del valor a editar"));
        int nuevoValor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor"));
        listaNumero.set(posicion,nuevoValor);
    }

    public void existeDato()
    {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea buscar"));
        boolean existe = listaNumero.contains(dato);
        if (existe)
            JOptionPane.showMessageDialog(null,"El dato "+dato+" existe");
        else
            JOptionPane.showMessageDialog(null,"El dato "+dato+" no existe");
    }

    public void posicionDato()
    {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea buscar"));
        int posicion = listaNumero.indexOf(dato);
        JOptionPane.showMessageDialog(null,"El dato "+dato+" se encuentra en la posicion "+posicion);
    }

    public void menu()
    {
        int op = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar \n2.Agregar \n3.Eliminar \n4.Editar \n5.Buscar \n0.Salir"));
        switch (op)
        {
            case 1:
                imprimir1();
                break;
            case 2:
                agregar();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
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
        Arrays arrays = new Arrays();
        arrays.agregar();
        arrays.imprimir1();
        arrays.imprimir2();
    }
}
