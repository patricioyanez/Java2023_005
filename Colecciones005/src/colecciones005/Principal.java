
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
        
        // metódos adicionales
        
        int indice = nombres.indexOf("Sanji");
        
        if(indice >=0)
            System.out.println("Existe");
        else
            System.out.println("No existe");
        
        boolean existe = nombres.contains("Robin");
        
        if(existe)
            System.out.println("contains = Existe");
        else
            System.out.println("contains = No existe");
     
        boolean fueEliminado = nombres.remove("Sanji");        
        if(fueEliminado)
            System.out.println("Fue eliminado");
        else
            System.out.println("No eliminado");
        
        System.out.println("Cantidad actual: " + nombres.size());
        
        String nombreEliminado = nombres.remove(2);
        System.out.println("Personaje Eliminado: " + nombreEliminado);
        
        // elimina todo los elementos de la coleccion
        System.out.println("Clear");
        System.out.println("(size)Cantidad actual: " + nombres.size());
        nombres.clear();        
        System.out.println("(size)Cantidad actual: " + nombres.size());
        
    }
    
}
