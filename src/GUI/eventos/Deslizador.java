package GUI.eventos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Deslizador {
    private JPanel mainPanel;
    private JSlider slider1;
    private JProgressBar progressBar1;
    private JLabel textPorcentaje;

    boolean estado = false;

    public Deslizador()
    {
        slider1.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                int valor = slider1.getValue();
                progressBar1.setValue(valor);
                textPorcentaje.setText(valor+"%");

                if (valor >= 60 && estado == false)
                {
                    JOptionPane.showMessageDialog(null,"Volumen demasiado alto");
                    estado = true;
                }
            }
        });
    }

    public static void main(String[] args)
    {
        //Creamos el marco
        JFrame frame = new JFrame("Evento Deslizador");
        //Unimos el panel con el marco
        frame.setContentPane(new Deslizador().mainPanel);
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
