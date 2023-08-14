public class Pizza {
    // atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    // constructor
    public Pizza()
    {
        this.nombre = "";
        this.tamano = "Personal";
        this.masa = "";
        this.precio = 0;
    }
    public Pizza(String nombre, String tamano, String masa, int precio)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        this.precio = precio;
    }
    // getter and setter
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    // métodos customer
    public void preparar()
    {
        // sout + TAB
        System.out.println("Pizza preparandose");
    }
    public void calentar()
    {
        System.out.println("Pizza calentandose");
    }

}
