public class PrincipalCiclo {
    public static void main(String[] args) {
        int numero = 1;
        
        while(numero <= 10)
        {
            System.out.println("Numero: " + numero);
            numero++; // numero = numero + 1;
            // numero += 1
            // ++numero;
        }
        //for(;;);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("For Numero: " + i);
        }
        int x = 0;
        for(; x <= 10;)
        {
            System.out.println("for 2: " + x++);
        }
        
        System.out.println("Fin de el código");
    }
}
