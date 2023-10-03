
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

    
}
