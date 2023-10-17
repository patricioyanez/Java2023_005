public class EjemploInterface implements IOperaciones {

    @Override
    public int calcularPeso() {
        return 100;
    }

    @Override
    public int calcularPeso(int kilosPerdida) {
        return 100 - kilosPerdida;
    }

    @Override
    public int grabar() {
        System.out.println("Guardando datos.....");
        System.out.println("Datos guardados.....");
        System.out.println("Continuar");
        return 1;
    }

    @Override
    public int eliminar() {        
        System.out.println("Buscando datos.....");
        System.out.println("Datos eliminados.....");
        System.out.println("Continuar");
        return 1;
    }
    public static void main(String[] args) {
        EjemploInterface ei = new EjemploInterface();
        System.out.println("Uso de metodo: " + ei.calcularPeso());
        System.out.println("Uso de metodo: " + ei.calcularPeso(20));
    }
}
