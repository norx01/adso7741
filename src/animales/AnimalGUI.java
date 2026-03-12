package animales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AnimalGUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JSpinner spinner1;
    private JComboBox comboBox1;
    private JRadioButton siRadioButton;
    private JButton guardarButton;
    private JButton mostrarButton;

    public AnimalGUI() {
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                guardarAnimal();
            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mostrarAnimal();
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hola "+textField1.getText());
            }
        });
    }

    List<Animal> animalList = new ArrayList<>();
    public void guardarAnimal()
    {
       String nombre = textField1.getText();
       String especie = textField2.getText();
       int edad = (int)spinner1.getValue();
       String color = (String)comboBox1.getSelectedItem();
       boolean esterilizado = siRadioButton.isSelected();

       Animal animal = new Animal(nombre,especie,edad,color,esterilizado);
       animalList.add(animal);
       JOptionPane.showMessageDialog(null,"Animal guardado");
    }

    public void mostrarAnimal()
    {
        for(Animal animal: animalList)
        {
            System.out.println("Animal:");
            System.out.println("Nombre: "+animal.getNombre());
            System.out.println("Especie: "+animal.getEspecie());
            System.out.println("Edad: "+animal.getEdad());
            System.out.println("Color: "+animal.getColor());
            System.out.println("Esterilizado: "+animal.isEsterilizado());
            System.out.println("======================");
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Animales");
        frame.setContentPane(new AnimalGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
    }
}
