
public class Saludable extends Comida {
    private boolean esOrigenVegetal;

    public Saludable() {
        this.esOrigenVegetal = false;
    }
    
    public Saludable(boolean esOrigenVegetal, String nombre, int calorias, int grasa, int sodio) {
        super(nombre, calorias, grasa, sodio);
        this.esOrigenVegetal = esOrigenVegetal;
    }

    public boolean isEsOrigenVegetal() {
        return esOrigenVegetal;
    }

    public void setEsOrigenVegetal(boolean esOrigenVegetal) {
        this.esOrigenVegetal = esOrigenVegetal;
    }

    public String imprimir() {
        return "***  Comida Saludable ***" +
               "\nNombre            : " + getNombre() +
               "\nCalorias          : " + getCalorias() +
               "\nGrasa             : " + getGrasa() +
               "\nSodio             : " + getSodio() +
               "\nEs Origen Vegetal : " + (esOrigenVegetal?"Si":"No")
                ;
    }
    // Leer las ppt 2.1.1 y 2.2.1
    // Ejercicio 2: crear la super clase animal y 2 subclases
    // gato y perro. Definir 3 atributos en común y 1 especifico
    // para cada subclase. Crear 1 perro y 2 gatos, mostrar sus datos.
    
}
