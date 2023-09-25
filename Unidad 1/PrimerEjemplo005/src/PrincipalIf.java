
import java.util.Scanner;


public class PrincipalIf {
    public static void main(String[] args) {
        System.out.println("Sentencia IF");
        if( 1 == 1)
            System.out.println("Números iguales");
        
        if( 2 == 2)
        {
            System.out.println("1ra Linea");
            System.out.println("2da Linea");
            System.out.println("x Lineas....");
        }
        
        if(3 > 10)
        {
            System.out.println("3 es mayor que 10");
        }
        else
        {
            System.out.println("3 no es mayor que 10"); 
        }
        
        int numero = 10;
        if(numero < 10)
        {
            System.out.println("Unidad");
        }
        else if(numero < 100)
        {
            System.out.println("Decena");
        }
        else if(numero < 100)
        {
            System.out.println("Centena");
        }
        else
        {
            System.out.println("Es un numero grande");
        }
        
        int edad = 0;        
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = leerTeclado.nextInt();
        
        if(edad >= 30 && edad <= 42 )//  and  or ||
        {
            System.out.println("Ud es un millennial");
        }
        else if (edad > 42 && edad <= 100 )
        {
            System.out.println("Ud es un Generación x o boomers");
        }
        else if (edad > 11 && edad <= 23 )
        {
            System.out.println("Ud es de Generación z");
        }
        // Ejercicio:
        // Solicitar al usuario su edad y clasificar su generación
    }
}
