import javax.swing.*;

public class Calculadora
{
    //atributos
    int num1;
    int num2;

    //Constructor
    public Calculadora(int num1, int num2)
    {
      this.num1 = num1;
      this.num2 = num2;
    }

    //metodos

    public int sumar()
    {
        return num1+num2;
    }

    public int restar()
    {
        return num1-num2;
    }

    public int multiplicar()
    {
        return num1*num2;
    }

    public double dividir()
    {
        return (double) num1/num2;
    }

    public boolean mayor()
    {
        return num1>num2;
    }

    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Bievenido");

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
       Calculadora calculadora = new Calculadora(num1,num2);

       System.out.println("Suma: "+calculadora.sumar());
       System.out.println("Resta: "+calculadora.restar());
       System.out.println("Multiplicacion: "+calculadora.multiplicar());
       System.out.println("Division: "+calculadora.dividir());
       System.out.println("Es mayor: "+calculadora.mayor());
    }

}
