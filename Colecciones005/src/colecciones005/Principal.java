
package colecciones005;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {

        //ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> nombres;
        nombres = new ArrayList<String>();
        
        // agregar
        nombres.add("Luffy");
        nombres.add("Roronoa");
        nombres.add("Nami");
        
        System.out.println("Personasjes de One Piece");
        System.out.println("- " + nombres.get(0));
        System.out.println("- " + nombres.get(1));
        System.out.println("- " + nombres.get(2));
                
        System.out.println("Cantidad de elementos: " + nombres.size());
        
        nombres.add("Sanji");
        nombres.add("Robin");
        
        System.out.println("Cantidad de elementos: " + nombres.size());

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Cantidad de numeros: " + numeros.size());
        numeros.add(10);
        numeros.add(20);
        numeros.add(60);
        System.out.println("Cantidad de numeros: " + numeros.size());
        
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre);
        }
        
        
    }
    
}
