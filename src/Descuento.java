public class Descuento
{
    //Estructuras condicionales
    //if - else if - else
    //switch

    public void validacion()
    {
        int x = 8;

        if(x>3)
        {
            System.out.println("x es mayor que 3");
        }
        if(x>4)
        {
            System.out.println("x es mayor que 4");
        }
        else
        {
            System.out.println("x es igual a 3");
        }
    }

    public void validarTexto()
    {
        String texto = "hola";

        if (texto.equals("hola"))
        {
           System.out.println("texto igual a hola");
        }
        else
        {
            System.out.println("texto no es igual a hola");
        }

    }

    public void mayorEdad()
    {
        int edad = 18;

        if(edad >= 18)
        {
            System.out.println("Es mayor de edad");
        }
        else
        {
            System.out.println("No es mayor de edad");
        }

    }

    public static void main(String[] args) {
        Descuento descuento = new Descuento();
        descuento.validarTexto();
    }

}
