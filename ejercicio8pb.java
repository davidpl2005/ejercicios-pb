import java.util.Scanner;
public class ejercicio8pb {
   public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    int dividiendo, divisor, resto;
     
    System.out.println(" Por favor ingrese el dividiendo:");
    dividiendo = scanner.nextInt();

    System.out.println(" Por favor ingrese el divisor: ");
    divisor = scanner.nextInt();

    resto = dividiendo / divisor;
    
    System.out.println(" el resto de la division entre: " + dividiendo + " Y " + divisor + " es: " + resto);

    scanner.close();

   } 
}
