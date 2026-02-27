package ciclos;

import javax.swing.*;

public class CicloDoWhile
{
    public void finito()
    {
        int contador = 0;

        do
        {
            System.out.println("hola");
            contador++;
        }while(contador < 4);
    }

    public void infinito()
    {
        int op;
        do {
            System.out.println("Hola");
            op= JOptionPane.showConfirmDialog(null,"Desea continuar?");

        }while (op == 0);
    }

    public static void main(String[] args) {
        CicloDoWhile cicloDoWhile = new CicloDoWhile();
        cicloDoWhile.infinito();
    }
}
