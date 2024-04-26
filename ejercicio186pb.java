import java.util.*;

public class ejercicio186pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa una palabra: ");
String palabra = scanner.nextLine();
scanner.close();
        
String palabraInversa = "";
        
for (int i = palabra.length() - 1; i >= 0; i--) {
            
palabraInversa += palabra.charAt(i);
}
System.out.println("La palabra en orden inverso es: " + palabraInversa);
    }
}