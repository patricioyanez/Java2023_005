
public class Comida {
    private String nombre;
    private int calorias;
    private int grasa;
    private int sodio;

    public Comida() {
        this.nombre = "";
        this.calorias = 0;
        this.grasa = 0;
        this.sodio = 0;
    }
    public Comida(String nombre, int calorias, int grasa, int sodio) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.grasa = grasa;
        this.sodio = sodio;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getGrasa() {
        return grasa;
    }

    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }

    public String imprimir() {
        return "Comida{" + "nombre=" + nombre + ", calorias=" + calorias + ", grasa=" + grasa + ", sodio=" + sodio + '}';
    }
    
    public String tipoComida()
    {
        return "Comida en general";
    }
}