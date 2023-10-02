
public class Principal {
    public static void main(String[] args) {
        // Ejercicio 2: 
        // crear 2 puestos y 2 empleados
        // agregarlo a la empresa (crear)
        Puesto p1 = new Puesto(1, "Gerente");
        Puesto p2 = new Puesto(2, "Ejecutivo");

        Empleado e1 = new Empleado("1-9", "Jhon", "M", 10, 50, p1);
        Empleado e2 = new Empleado("2-7", "Jaztine", "F", 3, 40, p2);   
        Empleado e3 = new Empleado("3-5", "Luffy", "F", 3, 15, p2);   
        Empleado e4 = new Empleado("4-3", "Nami", "F", 3, 20, p2);   
 
        Empresa scootin = new Empresa();
        scootin.agregar(e1);
        scootin.agregar(e2);
        scootin.agregar(e3);
        scootin.agregar(e4);
        
        System.out.println("**** Buscar Rut ****");
        boolean existe = scootin.buscarEmpleado("3-5");
        if(existe)
            System.out.println("El rut si existe");
        else
            System.out.println("El Rut NO existe");
        
        System.out.println("**** Listado de empleados *****");
        scootin.listarEmpleado();
        
        System.out.println("\nEliminar rut");
        if(scootin.eliminarEmpleado("4-3"))
            System.out.println("Empleado Eliminado");
        else
            System.out.println("Empleado no Eliminado");
        
        System.out.println("**** Listado de empleados *****");
        scootin.listarEmpleado();
        
        //Ejercicio 3
        // crear un menu con la opciones:
        // ingresar empleado, buscar si existe, 
        // listar todo, 
        //listar por puesto (seleccionar que puesto), 
        // eliminar por rut y salir

        
    }

    
}
