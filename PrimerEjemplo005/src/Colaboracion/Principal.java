package Colaboracion;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        // agregar datos a los atributos de la canción
        cancion.setNombre("Llueve sobre la ciudad");
        cancion.setArtista("Los Bunkers");
        cancion.setAlbum("Vida de perros");
        cancion.setGenero("Rock");
        cancion.setDuracion(400);
        System.out.println(cancion.imprimir());
        Streaming streaming = new Streaming(cancion, 100);
        System.out.println("\n\n" + streaming.imprimir());
        // Ejercicio: crear un método que permita  
        // mostrar cuantos segundos quedan de la canción
        
        System.out.println("\nSegundos faltantes: " + 
                streaming.calcularSegundosFaltantes());
        
                
        // ejercicio 2:
        // Crear otra canción y reproducirla.
        // solicitar los datos por la consola. 
        // todos los datos son obligatorios.
        
        Cancion cancion2 = new Cancion();
        
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Nombre    : ");
        cancion2.setNombre(leerTeclado.next());
        System.out.print("Banda     : ");
        cancion2.setArtista(leerTeclado.next());
        System.out.print("Album     : ");
        cancion2.setAlbum(leerTeclado.next());
        System.out.print("Género    : ");
        cancion2.setGenero(leerTeclado.next());
        System.out.print("Duración  : ");
        cancion2.setDuracion(leerTeclado.nextInt());
        
        streaming.setCancion(cancion2);
        streaming.setSegundosReproducidos(50);
        System.out.println(streaming.imprimir());
    }
}
