package arreglos;

import javax.swing.*;

public class Estudiantes
{
    String nombres[];
    double notas[];

    public void registrarEstudiantes()
    {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos estudiantes deseas registrar?"));

        if (cantidad >= 1 && cantidad <= 30)
        {
            nombres = new String[cantidad];
            notas = new double[cantidad];

            for (int i = 0; i < notas.length; i++)
            {
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante ["+i+"]");
                nombres[i] = nombre;

                notas[i] = registrarNota();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"La cantidad de estudiantes debe estar entre 1 y 30");
            registrarEstudiantes();
        }
    }

    public double registrarNota()
    {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("ingrese su nota"));

        if (nota >= 0 && nota <= 5)
        {
            return nota;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"La nota debe estar entre 0 y 5");
            return registrarNota();
        }
    }

    public void mostrarEstudiantes()
    {
        System.out.println("Lista de Estudiantes");
        for (int i = 0; i < nombres.length; i++)
        {
            System.out.println((i+1)+". "+nombres[i]+" "+notas[i]);
        }
    }

    public void calcularPromedio()
    {
        double promedio = 0;
        for (int i = 0; i < notas.length; i++)
        {
            promedio += notas[i];
        }
        promedio /= notas.length;
        System.out.println("El promedio es: "+promedio);
    }

    public void notaMaxima()
    {
        double maximo = notas[0];
        int posicion = 0;

        for (int i = 1; i < notas.length; i++)
        {
            if (notas[i] > maximo)
            {
                maximo = notas[i];
                posicion = i;
            }
        }

        System.out.println("La nota maxima es: "+maximo+" de: "+nombres[posicion]);
    }

    public void notaMinima()
    {
        double minimo = notas[0];
        int posicion = 0;

        for (int i = 1; i < notas.length; i++)
        {
            if (notas[i] < minimo)
            {
                minimo = notas[i];
                posicion = i;
            }
        }
        System.out.println("La nota minima es: "+minimo+" de: "+nombres[posicion]);
    }

    public void contadorNota()
    {
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++)
        {
            if (notas[i] >= 3)
                aprobados++;
            else if (notas[i] < 3)
                reprobados++;
        }
    }

    public void buscarNota()
    {
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota que desea buscar"));

        System.out.println("La nota aparece en las posiciones: ");

        for (int i = 0; i < notas.length; i++)
        {
            if (nota == notas[i])
            {
                System.out.println("Estudiante "+i);
            }
        }
    }



    public static void main(String[] args) {
        Estudiantes estudiantes = new Estudiantes();
        estudiantes.registrarEstudiantes();
        estudiantes.mostrarEstudiantes();
        estudiantes.buscarNota();
    }
}
