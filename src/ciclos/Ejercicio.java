package ciclos;

import javax.swing.*;

public class Ejercicio
{
    public void ejercicio1()
    {
        int suma = 0;
        for (int i=0; i<5;i++)
        {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            suma = suma + numero;
        }
        System.out.println("La suma es: "+suma);
    }

    public static void main(String[] args) {
        Ejercicio ejercicio = new Ejercicio();
        ejercicio.ejercicio1();
    }
}
