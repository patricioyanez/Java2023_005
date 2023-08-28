import java.util.Scanner;

public class PrincipalSwitch {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in); 
        
        System.out.print("Ingrese su grado de media: ");
        int curso = leerTeclado.nextInt();

        switch(curso)
        {
            case 1:
                System.out.println("Ud. es de 1ero medio");
                break;
            case 2:
                System.out.println("Ud. es de 2do medio");
                break;            
            case 3:
                System.out.println("Ud. es de 3ro medio");
                break;
            case 4:
                System.out.println("Ud. es de 4to medio");
                break;
            default:
                System.out.println("Valor no válido");
        }
        
    }
}
