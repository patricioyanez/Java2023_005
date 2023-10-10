
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
// sobre escribir: cambiar la funcionalidad del metodo heredado
    @Override
    public String tipoComida() {
        return "Esta comida es saludable";
    }

    @Override
    public String toString() {
        return "Saludable{" + "esOrigenVegetal=" + esOrigenVegetal + '}';
    }

// Sobre carga: uso del mismo nombre de metodo pero con 
    // diferente parametros de entrada
    
    public String cocinar()
    {
        return "Cocinar 15 minutos";
    }    
    public String cocinar(int minutos)
    {
        return "Cocinar " + minutos + " minutos";
    }
    public String cocinar(int minutos, String tipoCoccion)
    {
        return "Cocinar " + minutos + 
                " minutos. Tipo Cocción " + tipoCoccion;
    }
    
    
    
}
