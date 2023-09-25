
public class PrincipalString {
    public static void main(String[] args) {
        String valor = "Hola, ¿Cómo Están?";
        
        System.out.println("Length : " + valor.length());
        
        if(valor == "Hola, ¿Cómo Están?")
            System.out.println("ES IGUAL");
        else
            System.out.println("No ES Igual");
        
        if(valor.equals("Hola, ¿Cómo Están?"))
            System.out.println("ES IGUAL 2");
        else
            System.out.println("No ES Igual 2");
        
        System.out.println("Mayúscula: " + valor.toUpperCase());
        System.out.println("Minúscula: " + valor.toLowerCase());
        System.out.println("Remplazar: " + valor.replace(",", ".") );
        System.out.println("Valor    : " + valor);
        
        System.out.println("   Este texto tiene espacios    " );
        System.out.println("   Este texto tiene espacios    ".trim()  );
        
        System.out.println("Buscar posición de caracter " + "abc de".indexOf(" "));
        System.out.println("Hola Mundo".substring(0, 4) );
        
        //Ejercicio: Mostrar el primer nombre de:
        // Juan Carlos
        // Ana Maria
        // Patricio Alejandro
        String nombre = "Patricio Alejandro";
        System.out.println("**** Ejercicio  ******");
        System.out.println(nombre.substring(0, nombre.indexOf(" ")));
    }   
    
}
