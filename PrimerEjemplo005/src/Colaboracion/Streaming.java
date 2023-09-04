package Colaboracion;

public class Streaming {
    private Cancion cancion;
    private int segundosReproducidos;

    public Streaming() {
        this.cancion = null; // new Cancion();
        this.segundosReproducidos = 0;
    }
    
    public Streaming(Cancion cancion, int segundosReproducidos) {
        this.cancion = cancion;
        this.segundosReproducidos = segundosReproducidos;
    }

    public int getSegundosReproducidos() {
        return segundosReproducidos;
    }

    public void setSegundosReproducidos(int segundosReproducidos) {
        this.segundosReproducidos = segundosReproducidos;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public String imprimir() {
        return "****** Titulo en reproducción ******\n" +
                cancion.imprimir() +
                "\nSegundos Reproducidos=" + segundosReproducidos;
    }
    public int calcularSegundosFaltantes()
    {
        return cancion.getDuracion() - this.segundosReproducidos;
    }
    
    // https://www.youtube.com/watch?v=0zWsbZ8aqhw&list=PLk2rufbc0DMq2lsPolk3ZmFSSvmGkUw19
    
    
}
