package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GourmetWorld {
    private JComboBox comboBox1;
    private JPanel panel1;
    private JList list1;

    public GourmetWorld() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion = comboBox1.getSelectedItem().toString();

                String[] items = {"Opcion no disponible"};

                if (opcion.equals("Entrada"))
                {
                    items = new String[]{"Ensalada primavera", "Ensalada cesar"};
                }
                else if (opcion.equals("Plato Fuerte"))
                {
                    items = new String[]{"Pizza", "Hamburguesa", "Hot Dogs", "Tacos", "Pasta", "Ensalada", "Sopa"};
                }
                else if (opcion.equals("Bebida"))
                {
                    items = new String[]{"Pepsi", "Coca Cola", "Fanta"};
                }
                else
                {
                    items = new String[]{"Opcion no disponible"};
                }
                list1.setListData(items);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gourmet World");
        frame.setContentPane(new GourmetWorld().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
