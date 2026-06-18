package GUI.eventos;

import javax.swing.*;
import java.awt.event.*;

public class Teclado {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;

    int contador = 0;

    public Teclado()
    {
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e)
            {
                super.keyPressed(e);
                char caracter = e.getKeyChar();
                JOptionPane.showMessageDialog(null,"Has pulsado "+caracter);
            }
        });

        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Has pulsado ENTER");
            }
        });
        textField3.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusLost(FocusEvent e)
            {
                super.focusLost(e);
                String texto = textField3.getText();

                if (!texto.contains("@gmail.com"))
                {
                    JOptionPane.showMessageDialog(null,"El correo no es valido");
                    textField3.setText("");
                }
            }
        });

        textField4.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e)
            {
                super.focusGained(e);
                contador++;
                textField4.setText(contador+"");
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Teclado");
        frame.setContentPane(new Teclado().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
