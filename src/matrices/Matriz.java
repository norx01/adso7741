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

    public void modificarDato()
    {
        int posY = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion en Y"));
        int posx = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion en X"));
        int nuevoValor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo valor"));
        numeros[posY][posx] = nuevoValor;

    }

    public void eliminarDato()
    {
        int posY = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion en Y"));
        int posx = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion en X"));
        numeros[posY][posx] = 0;
    }

    public void buscarVector()
    {
        boolean encontrado = false;
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato que desea buscar"));

        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                if (dato == numeros[i][j])
                {
                    System.out.println("El dato " + dato + " se encuentra en la posicion " + i);
                    encontrado = true;
                }
            }
        }

        if (!encontrado)
        {
            System.out.println("El dato no se encuentra en la matriz");
        }
    }

    public void sumarMatriz()
    {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                suma += numeros[i][j];
            }

        }
        System.out.println("La suma de la matriz es: "+suma);
    }

    public void sumarMatrizFilas()
    {

        for (int i = 0; i < numeros.length; i++)
        {
            int suma = 0;
            for (int j = 0; j < numeros[i].length; j++)
            {
                suma += numeros[i][j];
            }
            System.out.println("La suma de la matriz en la fila: "+i+" es: "+suma);
        }
    }

    public void sumarMatrizColumnas()
    {
        for (int i = 0; i < numeros[0].length; i++)
        {
            int suma = 0;
            for (int j = 0; j < numeros.length; j++)
            {
                suma += numeros[j][i];
            }
            System.out.println("La suma de la matriz en la columna: "+i+" es: "+suma);
        }
    }

    public void sumarMatrizDiagonal1()
    {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++)
        {
            suma+= numeros[i][i];
        }
        System.out.println("La suma de la diagonal principal es: "+suma);
    }
    public void sumaMatrizDiagonal2() {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            int j = numeros[i].length - 1 - i;
            suma += numeros[i][j];
        }
        System.out.println("La suma de la diagonal secundaria es: " + suma);
    }

    public  void parImpar()
    {
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                if (numeros[i][j] % 2 == 0)
                {
                    System.out.println("El numero "+numeros[i][j]+" es par, en la posicion ["+i+"]["+j+"]"  );
                }
                else
                {
                    System.out.println("El numero "+numeros[i][j]+" es impar, en la posicion ["+i+"]["+j+"]");
                }
            }
        }
    }

    public void mayorMenor()
    {
        int mayor = numeros[0][0];
        int menor = numeros[0][0];
        int posMayorI = 0, posMenorI = 0;
        int posMayorJ = 0, posMenorJ = 0;

        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                if (numeros[i][j] > mayor)
                {
                    mayor = numeros[i][j];
                    posMayorI = i;
                    posMayorJ = j;
                }
                if (numeros[i][j] < menor)
                {
                    menor = numeros[i][j];
                    posMenorI = i;
                    posMenorJ = j;
                }
            }
            System.out.println("El mayor numero es: "+mayor+" en la posicion ["+posMayorI+"]["+posMayorJ+"]");
            System.out.println("El menor numero es: "+menor+" en la posicion ["+posMenorI+"]["+posMenorJ+"]");

        }


    }
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        matriz.agregarDatos();
        matriz.mostrarMatriz();
        matriz.sumarMatriz();
        matriz.sumarMatrizFilas();
        matriz.sumarMatrizColumnas();
        matriz.sumarMatrizDiagonal1();
        matriz.sumaMatrizDiagonal2();
        matriz.parImpar();
        matriz.mayorMenor();
    }
}
