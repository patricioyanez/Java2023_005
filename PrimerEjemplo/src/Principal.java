
public class Principal {
   //método main
    public static void main(String args[])
    {// entry point
        System.out.println("Hola Mundo!!!");
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("Española", "Mediana", "Delgada", 8000);

        System.out.println("Pizza1:" + pizza1.getTamano() );
        System.out.println("Pizza2:" + pizza2.getTamano() );
        
        pizza1.setTamano("Familiar");
        System.out.println("Pizza1 cambio:" + pizza1.getTamano());
        
        System.out.println("\n**** Pizza 2 *****");
        System.out.println("Nombre : " + pizza2.getNombre());
        System.out.println("Tamaño : " + pizza2.getTamano());
        System.out.println("Masa   : " + pizza2.getMasa());
        System.out.println("Precio : " + pizza2.getPrecio());
        
        // agregar datos a pizza1 y mostrarlos por la consola
        pizza1.setMasa("Delgada");
        pizza1.setNombre("Hawaii");
        pizza1.setPrecio(10000);
        pizza1.setTamano("Mediana");

        System.out.println("\n**** Pizza 1 *****");
        System.out.println("Nombre : " + pizza1.getNombre());
        System.out.println("Tamaño : " + pizza1.getTamano());
        System.out.println("Masa   : " + pizza1.getMasa());
        System.out.println("Precio : " + pizza1.getPrecio());
        
        
        // imprimir datos usando método
        System.out.println("\n\nImprimir datos de Pizzas");
        System.out.println("\n**** Pizza 1 *****");
        System.out.println(pizza1.datos());
        System.out.println("\n**** Pizza 2 *****");
        System.out.println(pizza2.datos());
    }
}
