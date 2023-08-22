import java.util.Scanner;
public class PrincipalScanner {
    // atajo: psvm + tab
    // main + tab
    public static void main(String[] args) {
        // crear objeto para leer el teclado
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        //              Obtiene lo escrito por el usuario 
        // el tipo de datos es STRING
        String nombre = leerTeclado.next();
        
        
        System.out.println("Hola " + nombre + ", ¿Cómo estás?");
        
        System.out.println("¿Cúal es su edad?:");
        int edad = leerTeclado.nextInt();
        System.out.println("Su edad es :" + edad);
        
        // permite convertir un String a un número válido
        System.out.println("¿Cuanto gana mensual?");
        int sueldo = Integer.parseInt(leerTeclado.next());
        
        sueldo = sueldo + 10000;
        
        System.out.println("Su sueldo final:" + sueldo);
        
    }
}
