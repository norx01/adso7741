package GUI.eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse {
    private JPanel mainPanel;

    public Mouse() {
        mainPanel.addMouseListener(new MouseAdapter()
        {

            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                if (e.getClickCount() == 2)
                {
                    mainPanel.setBackground(Color.green);
                }
                else
                {
                    mainPanel.setBackground(Color.red);
                }
            }
        });

        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                super.mouseEntered(e);
                mainPanel.setBackground(Color.yellow);
            }
        });

        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e)
            {
                super.mouseExited(e);
                mainPanel.setBackground(Color.blue);
            }
        });
        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                mainPanel.setBackground(Color.pink);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse");
        frame.setContentPane(new Mouse().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}
