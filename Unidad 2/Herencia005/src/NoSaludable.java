
public class NoSaludable extends Comida{
    private String marca;
    
    public NoSaludable(){
        this.marca = "";
    }
    public NoSaludable(String marca, String nombre, int calorias, int grasa, int sodio) {
        super(nombre, calorias, grasa, sodio);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String imprimir() {
        return "NoSaludable{" + "marca=" + marca + '}';
    }
    
    
}
