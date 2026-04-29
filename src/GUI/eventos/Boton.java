package GUI.eventos;

import GUI.AdivinadorGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton {
    private JPanel mainPanel;
    private JButton button1;
    private JLabel textEstado;


    public Boton()
    {
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               //Aqui se programa la accion del evento
               //JOptionPane.showMessageDialog(null,"Hiciste click en el boton");

               comparar2();

            }
        });
    }

    boolean estado = true;
    public void comparar2()
    {

        if (estado)
        {
            textEstado.setText("Inactivo");
            estado = false;
        }
        else
        {
            textEstado.setText("Activo");
            estado = true;
        }

    }

    public void comparar1()
    {
        if (textEstado.getText().equals("Inactivo"))
        {
            textEstado.setText("Activo");
        }
        else
        {
            textEstado.setText("Inactivo");
        }
    }

    public static void main(String[] args)
    {
        //Creamos el marco
        JFrame frame = new JFrame("Evento Boton");
        //Unimos el panel con el marco
        frame.setContentPane(new Boton().mainPanel);
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
