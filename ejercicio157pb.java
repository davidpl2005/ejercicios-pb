import java.util.*;

public class ejercicio157pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa tu nombre en MAYÚSCULAS: ");
String nombre = scanner.nextLine();
scanner.close();
        
if (nombre.startsWith("A")) {
nombre = nombre.toLowerCase();
            
System.out.println("Nombre convertido a minúsculas: " + nombre);
} else {
System.out.println("Nombre no convertido a minúsculas: " + nombre);
        }
    }
}
