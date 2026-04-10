package matrices;

import javax.swing.*;

public class Matriz
{
    //Creamos una matriz de 2X3
    //el primer numero es la altura (Y) y el segundo numero es la anchura (X)
    int[][] numeros = new int[2][3];

    //metodo para imprimir la matriz
    public void mostrarMatriz()
    {
        //recorremos la matriz en el eje Y
        for (int i = 0; i < numeros.length; i++)
        {
            //recorremos la matriz en el eje X
            for (int j = 0; j < numeros[i].length; j++)
            {
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void agregarDatos()
    {
        for (int i = 0; i < numeros.length ; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                numeros[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato ["+i+"]["+j+"]"));
            }
        }
    }

    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        matriz.agregarDatos();
        matriz.mostrarMatriz();
    }
}
