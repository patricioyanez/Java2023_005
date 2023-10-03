
public class Principal {
    public static void main(String[] args) {
        Saludable manzana = new Saludable();
        manzana.setCalorias(100);
        manzana.setEsOrigenVegetal(true);
        manzana.setGrasa(10);
        manzana.setNombre("Manzana");
        manzana.setSodio(5);
        
        //Ejercicio 1: imprimir todos los datos
        // de la manzana
        System.out.println(manzana.imprimir());
            // Leer las ppt 2.1.1 y 2.2.1
        // Ejercicio 2: crear la super clase animal y 2 subclases
        // gato y perro. Definir 3 atributos en común y 1 especifico
        // para cada subclase. Crear 1 perro y 2 gatos, mostrar sus datos.
    }
}
