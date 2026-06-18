package GUI.astrotrip;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AstroTrip {
    private JPanel mainPanel;
    private JTextField campoNombre;
    private JComboBox destinoComboBox;
    private JRadioButton economicaRadioButton;
    private JRadioButton ejecutivaRadioButton;
    private JRadioButton premiumRadioButton;
    private JSpinner spinner1;
    private JCheckBox trajeEspacialPersonalizadoCheckBox;
    private JCheckBox caminataEspacialCheckBox;
    private JCheckBox comidaEspacialGourmetCheckBox;
    private JCheckBox seguroInterplanetarioCheckBox;
    private JButton calcularButton;
    private JButton limpiarButton;
    private JTextArea textArea1;
    private JLabel textoDestino;
    private JLabel textoNave;
    private JLabel textoPasajeros;
    private JLabel textoServicios;


    double precio = 0;
    double pasajeros = 0;
    double serviciosAdicionales = 0;
    double incrementoNave = 0;
    int cantPasajeros = 0;

    public AstroTrip()
    {
        destinoComboBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                String op = destinoComboBox.getSelectedItem().toString();

                switch (op)
                {
                    case "Luna":
                        precio = 5000000;
                        break;
                    case "Marte":
                        precio = 15000000;
                        break;
                    case "Estación Espacial Internacional":
                        precio = 8000000;
                        break;
                    case "Europa, luna de Júpiter":
                        precio = 25000000;
                        break;
                    default:
                        precio = 0;
                        JOptionPane.showMessageDialog(null,"Destino no valido");
                        break;
                }
                textoDestino.setText("Valor destino: $"+precio);
            }
        });
        economicaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                premiumRadioButton.setSelected(false);
                ejecutivaRadioButton.setSelected(false);
                incrementoNave = 0;
                textoNave.setText("Valor incremento nave: $"+incrementoNave);
            }
        });

        ejecutivaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                economicaRadioButton.setSelected(false);
                premiumRadioButton.setSelected(false);
                incrementoNave = precio*0.3;
                textoNave.setText("Valor incremento nave: $"+incrementoNave);
            }

        });
        premiumRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                economicaRadioButton.setSelected(false);
                ejecutivaRadioButton.setSelected(false);
                incrementoNave = precio*0.6;
                textoNave.setText("Valor incremento nave: $"+incrementoNave);
            }
        });

        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                cantPasajeros = (int) spinner1.getValue();
                pasajeros = cantPasajeros*precio;
                textoPasajeros.setText("Valor pasajeros: $"+pasajeros);
            }
        });

        trajeEspacialPersonalizadoCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (trajeEspacialPersonalizadoCheckBox.isSelected())
                {
                    serviciosAdicionales += 1000000*cantPasajeros;
                }
                else
                {
                    serviciosAdicionales -= 1000000*cantPasajeros;
                }
                textoServicios.setText("Valor servicios adicionales: $"+serviciosAdicionales);
            }
        });
        caminataEspacialCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (caminataEspacialCheckBox.isSelected())
                {
                    serviciosAdicionales += 3500000*cantPasajeros;
                }
                else
                {
                    serviciosAdicionales -= 3500000*cantPasajeros;
                }
                textoServicios.setText("Valor servicios adicionales: $"+serviciosAdicionales);
            }
        });
        comidaEspacialGourmetCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comidaEspacialGourmetCheckBox.isSelected())
                {
                    serviciosAdicionales += 800000*cantPasajeros;
                }
                else
                {
                    serviciosAdicionales -= 800000*cantPasajeros;
                }
                textoServicios.setText("Valor servicios adicionales: $"+serviciosAdicionales);
            }
        });
        seguroInterplanetarioCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comidaEspacialGourmetCheckBox.isSelected())
                {
                    serviciosAdicionales += 2000000*cantPasajeros;
                }
                else
                {
                    serviciosAdicionales -= 2000000*cantPasajeros;
                }
                textoServicios.setText("Valor servicios adicionales: $"+serviciosAdicionales);
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spinner1.setValue(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AstroTrip");
        frame.setContentPane(new AstroTrip().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,800);
    }
}
