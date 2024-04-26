import java.util.*;

public class ejercicio193pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa un número entre 1 y 255: ");
        
int numero = scanner.nextInt();
        
if (numero < 1 || numero > 255) {
            
System.out.println("El número ingresado está fuera del rango válido.");
        
} else {
String binario = Integer.toBinaryString(numero);
System.out.println("El número " + numero + " en binario es: " + binario);
}
scanner.close();
    }
}