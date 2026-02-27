import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GestorEstudiantesYmaterias {

    private JPanel mainPanel;
    private JButton crearEstudianteButton;
    private JButton crearMateriaButton;
    private JButton crearRegistroButton;
    private JButton mostrarTableButton;

    ArrayList<String> Estudiantes = new ArrayList<>();
    ArrayList<String> Materias = new ArrayList<>();
    ArrayList<String> Registros = new ArrayList<>();

    // Clase Estudiante
    public class Estudiante {
        String Codigo;
        String Nombre;
        int Edad;
        String ProgramaAcademico;
    }

    // Clase Materia
    public class Materia {
        String codigoMateria;
        String nombreMateria;
        int creditos;
    }


    public void CrearEstudiante() {
        String Codigo = JOptionPane.showInputDialog("Ingrese su Codigo:");
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad:"));
        if (Edad < 0) {
            JOptionPane.showMessageDialog(null, "ERROR:Edad negativa");
            CrearEstudiante();
            return;
        }
        String ProgramaAcademico = JOptionPane.showInputDialog("Ingrese su Programa Academico:");

        Estudiantes.add("Codigo:" + Codigo + ",Nombre: " + nombre + ",Edad: " + Edad + ",Programa: " + ProgramaAcademico);
    }


    public void CrearMateria() {
        String codigoMateria = JOptionPane.showInputDialog("Ingrese el codigo de la materia:");
        String nombreMateria = JOptionPane.showInputDialog("Ingrese el nombre de la materia:");
        int creditos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los creditos de la materia:"));

        Materias.add("Código: " + codigoMateria + ", Nombre: " + nombreMateria + ", Creditos: " + creditos);

        JOptionPane.showMessageDialog(null, "Materia creada:\n" +
                "Codigo: " + codigoMateria + "\n" +
                "Nombre: " + nombreMateria + "\n" +
                "Creditos: " + creditos);
    }

    public void Registro() {
        String Codigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante:");
        String codigoMateria = JOptionPane.showInputDialog("Ingrese el código de la materia:");

        Registros.add("Estudiante: " + Codigo + " - Materi: " + codigoMateria);

        JOptionPane.showMessageDialog(null, "Registro creado:\nEstudiante " + Codigo + " inscrito en Materia " + codigoMateria);
    }

    public void MostrarTabla() {
        StringBuilder sb = new StringBuilder();

        sb.append("=== ESTUDIANTES ===\n");
        for (String e : Estudiantes) {
            sb.append(e).append("\n");
        }

        sb.append("\n=== MATERIAS ===\n");
        for (String m : Materias) {
            sb.append(m).append("\n");
        }

        sb.append("\n=== REGISTROS ===\n");
        for (String r : Registros) {
            sb.append(r).append("\n");
        }

        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(500, 400));
        JOptionPane.showMessageDialog(null, scrollPane, "Datos almacenados", JOptionPane.INFORMATION_MESSAGE);
    }

    public GestorEstudiantesYmaterias() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 10, 10));

        crearEstudianteButton = new JButton("Crear Estudiante");
        crearMateriaButton = new JButton("Crear Materia");
        crearRegistroButton = new JButton("Crear Registro");
        mostrarTableButton = new JButton("Mostrar Todo");

        mainPanel.add(crearEstudianteButton);
        mainPanel.add(crearMateriaButton);
        mainPanel.add(crearRegistroButton);
        mainPanel.add(mostrarTableButton);

        crearEstudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CrearEstudiante();
            }
        });

        crearMateriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CrearMateria();
            }
        });

        crearRegistroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro();
            }
        });

        mostrarTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MostrarTabla();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestor Estudiantes y Materias");
        frame.setContentPane(new GestorEstudiantesYmaterias().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
