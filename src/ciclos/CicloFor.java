package ciclos;

public class CicloFor
{
    public void incremento()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.print(i+" ");
        }
    }

    public void decremento()
    {
        for(int i=10;i>=0;i--)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args)
    {
        CicloFor cicloFor = new CicloFor();
        System.out.println("Incremento");
        cicloFor.incremento();
        System.out.println("");
        System.out.println("Decremento");
        cicloFor.decremento();
    }
}
