
public class Trabajador {
    private String rut;
    private String dv;
    private String nombre;

    public Trabajador() {
        this.rut = "";
        this.dv = "";
        this.nombre = "";
    }
    
    public Trabajador(String rut, String dv, String nombre) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }


    public String imprimir() {
        return "Rut=" + rut + "-" + dv + 
                "\nnombre=" + nombre;
    }
    
    
}
