package Colaboracion;

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
    }
}
