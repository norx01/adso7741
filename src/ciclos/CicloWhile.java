package ciclos;

import javax.swing.*;

public class CicloWhile
{
    public void finito()
    {
        int contador = 0;

        while (contador < 10)
        {
            System.out.println(contador);
            contador++;
        }
    }

    public void infinito()
    {
        int op = 0;
        while (op == 0)
        {
            System.out.println("Hola");
            op= JOptionPane.showConfirmDialog(null,"Desea continuar?");
        }

    }

    public static void main(String[] args)
    {
        CicloWhile cicloWhile = new CicloWhile();
        cicloWhile.infinito();
    }
}
