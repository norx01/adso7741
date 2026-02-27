import javax.swing.*;

public class Taller
{
    public void punto1()
    {
        //Impresion por consola
        System.out.println("Hola mundo");

        //impresion por pantalla
        JOptionPane.showMessageDialog(null,"Hola mundo");
    }

    public void punto2()
    {
        int num1 = 3;
        int num2 = 8;
        int suma = num1+num2;
        System.out.println("La suma es: "+suma);
        JOptionPane.showMessageDialog(null,"La suma es: "+suma);
    }

    public void punto3()
    {
        double gradosCelsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados celsius"));
        double gradosFahrenheit = (gradosCelsius * 9/5) + 32;
        JOptionPane.showMessageDialog(null,"Los grados fahrenheit son: "+gradosFahrenheit);
    }

    public void punto4()
    {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
        double area = base*altura;
        JOptionPane.showMessageDialog(null,"El area es: "+area);
    }

    public void punto5()
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
        double promedio = (num1+num2+num3)/3;
        JOptionPane.showMessageDialog(null,"El promedio es: "+promedio);
    }

    public void punto6()
    {
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));
        double salarioFinal = salario*horas;
        JOptionPane.showMessageDialog(null,"El salario final es: "+salarioFinal);
    }

    public void punto7()
    {
        int anoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
        int anoActual= 2025;
        int edadActual = anoActual-anoNacimiento;
        JOptionPane.showMessageDialog(null,"Su edad actual es: "+edadActual);
    }

    public void punto8()
    {
        int totalCompra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de su compra"));
        double descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento"));
        descuento = descuento/100;

        double total = totalCompra - (totalCompra*descuento);
        JOptionPane.showMessageDialog(null,"El total con descuento es: "+total);
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ejecute el punto"));

        switch (opcion)
        {
            case 1:
                punto1();
                break;
            case 2:
                punto2();
               break;
            case 3:
                punto3();
                break;
            case 4:
                punto4();
                break;
            case 5:
                punto5();
                break;
            case 8:
                punto8();
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



    public static void main(String[] args)
    {
        Taller taller = new Taller();
        taller.menu();
    }
}
