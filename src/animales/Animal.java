package animales;

public class Animal
{
    private String nombre;
    private String especie;
    private int edad;
    private String color;
    private boolean esterilizado;

    public Animal(String nombre, String especie, int edad, String color, boolean esterilizado) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.color = color;
        this.esterilizado = esterilizado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }
}
