package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AdivinadorGUI
{
    private JPanel mainPanel;
    private JTextField campoNumero;
    private JButton adivinarButton;

    int numeroAdivinar = 10;


    //Constructor de la clase
    public AdivinadorGUI()
    {
        //generarRamdon();

        adivinarButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int numero = Integer.parseInt(campoNumero.getText());

                if (numero == numeroAdivinar)
                {
                    JOptionPane.showMessageDialog(null,"Eres un genio, Adivinaste!!");
                    mainPanel.setBackground(Color.green);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Lo siento, Intentalo de nuevo");
                    mainPanel.setBackground(Color.red);
                }
            }
        });
    }

    //metodo para crear numero aleatorio
    public void generarRamdon()
    {
        //Creamos el objeto Ramdon
        Random random = new Random();
        //asignamos el numero aleatorio
        numeroAdivinar = random.nextInt(20)+1;
    }

    public static void main(String[] args)
    {
        //Creamos el marco
        JFrame frame = new JFrame("Adivinar Numero");
        //Unimos el panel con el marco
        frame.setContentPane(new AdivinadorGUI().mainPanel);
        //Al cerrar la ventana se cierra el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Hacemos visible la ventana
        frame.setVisible(true);
        //Ajustamos los elementos
        frame.pack();
        //Ajustamos el tamaño de la ventana
        frame.setSize(500,500);
    }
}
