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
    private JLabel textVidas;
    private JButton reiniciarButton;

    int numeroAdivinar = 0;
    int vidas = 3;


    //Constructor de la clase
    public AdivinadorGUI()
    {
        textVidas.setText("Vidas: "+vidas);
        generarRamdon();

        adivinarButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                adivinar();
            }
        });
        campoNumero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                adivinar();

            }
        });
        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciar();
            }
        });
    }

    public void adivinar()
    {
        int numero = Integer.parseInt(campoNumero.getText());
        int diferencia = Math.abs(numeroAdivinar - numero);

        if (numero == numeroAdivinar)
        {
            JOptionPane.showMessageDialog(null,"Eres un genio, Adivinaste!!");
            mainPanel.setBackground(Color.green);
            adivinarButton.setEnabled(false);
            campoNumero.setEnabled(false);
            return;
        }
        else if(diferencia >= 1 && diferencia <= 3)
        {
            JOptionPane.showMessageDialog(null,"Caliente");
            mainPanel.setBackground(Color.red);
            campoNumero.setText("");
            Toolkit.getDefaultToolkit().beep();

        }
        else if(diferencia >= 4 && diferencia <= 6)
        {
            JOptionPane.showMessageDialog(null,"Tibio");
            mainPanel.setBackground(Color.orange);
            campoNumero.setText("");
            Toolkit.getDefaultToolkit().beep();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Frio");
            mainPanel.setBackground(Color.blue);
            campoNumero.setText("");
            Toolkit.getDefaultToolkit().beep();
        }
        vidas--;
        textVidas.setText("Vidas: "+vidas);

        if (vidas == 0)
        {
            JOptionPane.showMessageDialog(null,"Game Over, Perdedor");
            mainPanel.setBackground(Color.black);
            adivinarButton.setEnabled(false);
            campoNumero.setEnabled(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El numero era: "+numeroAdivinar);
        }
    }

    public void reiniciar()
    {
        generarRamdon();
        vidas = 3;
        textVidas.setText("Vidas: "+vidas);
        mainPanel.setBackground(Color.white);
        adivinarButton.setEnabled(true);
        campoNumero.setEnabled(true);
        campoNumero.setText("");
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
