package matrices;

import javax.swing.*;
import java.util.Random;

public class Rutas
{
    int[][] recorridos = new int[7][5];

    String[] dias;
    String[] rutasBus;

    public Rutas()
    {
        /*
        recorridos = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25},
                {26,27,28,29,30},
                {31,32,33,34,35}
        };

         */

        dias = new String[]{"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        rutasBus = new String[]{"Ruta 1","Ruta 2","Ruta 3","Ruta 4","Ruta 5"};
    }

    void pasajerosDia()
    {
        int pasajeros = 0;
        int dia = 0;

        for (int i = 0; i < recorridos.length; i++)
        {
            for (int j = 0; j < recorridos[i].length; j++)
            {
                pasajeros += recorridos[i][j];
                dia = i;
            }
            System.out.println("El dia "+dias[dia]+" tiene "+pasajeros+" pasajeros");
            pasajeros = 0;
        }
    }

    void pasajerosRuta()
    {
        int pasajeros = 0;
        int ruta = 0;

        for (int i = 0; i < recorridos[0].length; i++)
        {
            for (int j = 0; j < recorridos.length; j++)
            {
                pasajeros += recorridos[j][i];
                ruta = i;
            }
            System.out.println("La "+rutasBus[ruta]+" tiene "+pasajeros+" pasajeros");
            pasajeros = 0;
        }

    }

    void promedioDia()
    {
        int pasajeros = 0;
        int dia = 0;

        for (int i = 0; i < recorridos.length; i++)
        {
            for (int j = 0; j < recorridos[i].length; j++)
            {
                pasajeros += recorridos[i][j];
                dia = i;
            }
            pasajeros /= 5;
            System.out.println("el dia "+dias[dia]+" tiene un promedio de "+pasajeros+" pasajeros");
            pasajeros = 0;
        }
    }

    public void mayorMenor() {
        int mayor = recorridos[0][0];
        int menor = recorridos[0][0];
        int posMayorI = 0, posMenorI = 0;
        int posMayorJ = 0, posMenorJ = 0;

        for (int i = 0; i < recorridos.length; i++) {
            for (int j = 0; j < recorridos[i].length; j++) {
                if (recorridos[i][j] > mayor) {
                    mayor = recorridos[i][j];
                    posMayorI = i;
                    posMayorJ = j;
                }
                if (recorridos[i][j] < menor) {
                    menor = recorridos[i][j];
                    posMenorI = i;
                    posMenorJ = j;
                }
            }
        }
        System.out.println("El dia con el mayor numero es: " + dias[posMayorI] + " con un numero de " + recorridos[posMayorI][posMayorJ] + " pasajeros");
        System.out.println("La ruta con el menor numero es: " + rutasBus[posMenorJ] + " con un numero de " + recorridos[posMenorI][posMenorJ] + " pasajeros");
    }

    public void mostrarMatriz() {

        System.out.printf("%-10s", ""); // espacio para días
        for (int j = 0; j < recorridos[0].length; j++)
        {
            System.out.printf("Ruta%-4d", j + 1);
        }
        System.out.println();

        for (int i = 0; i < recorridos.length; i++)
        {

            System.out.printf("%-12s", dias[i]); // alinea los días

            for (int j = 0; j < recorridos[i].length; j++)
            {
                System.out.printf("%-8d", recorridos[i][j]); // alinea números
            }

            System.out.println();
        }
    }

    void llenarAleatorio()
    {
        Random random = new Random();

        for (int i = 0; i < recorridos.length; i++)
        {
            for (int j = 0; j < recorridos[i].length; j++)
            {
                recorridos[i][j] = random.nextInt(100)+1;
            }
        }
    }

    void menu()
    {
        String opciones = "1.Mostrar Matriz\n2.Total x dia\n3.Total x ruta\n4.Promedio x dia\n5.Mayor x menor\n6.Llenar aleatorio\n0.Salir";
        int op = Integer.parseInt(JOptionPane.showInputDialog(opciones));

        switch (op)
        {
            case 1:
                mostrarMatriz();
                break;
            case 2:
                pasajerosDia();
                break;
            case 3:
                pasajerosRuta();
                break;
            case 4:
                promedioDia();
                break;
            case 5:
                mayorMenor();
                break;
            case 6:
                llenarAleatorio();
                break;
            case 0:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
                break;
        }
        menu();
    }



    public static void main(String[] args) {
        Rutas rutas = new Rutas();
        rutas.menu();

    }
}
