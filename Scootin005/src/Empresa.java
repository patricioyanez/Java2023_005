
import java.util.ArrayList;


public class Empresa {
    // otra forma de crear la colección sin usar constructor
    //ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    ArrayList<Empleado> empleados;
    
    public Empresa()
    {
        empleados = new ArrayList<Empleado>();
    }
    
    // CRUD: create, read, update y delete
    public boolean agregar(Empleado empleado)
    {
        // ejercicio 1: evitar que el rut se repita???
        return empleados.add(empleado);
    }
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equals(rut))
                return true;
        }
        return false;
    }
    
    public void listarEmpleado()
    {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.imprimir());
        }
    }
    
    public boolean eliminarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equals(rut))
                return empleados.remove(empleado);
        }
        return false;
    }
}
