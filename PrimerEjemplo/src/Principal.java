
public class Principal {
   //método main
    public static void main(String args[])
    {// entry point
        System.out.println("Hola Mundo!!!");
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("Española", "Mediana", "Delgada", 8000);
        System.out.println("Pizza1:" + pizza1.getTamano() );
        System.out.println("Pizza2:" + pizza2.getTamano() );
    }
}
