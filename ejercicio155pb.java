import java.util.*;

public class ejercicio155pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa una palabra: ");
String palabra = scanner.nextLine();
scanner.close();
        
if (esPalindromo(palabra)) {
System.out.println("La palabra '" + palabra + "' es un palíndromo.");
        
} else {
System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
        }
    }
    
public static boolean esPalindromo(String palabra) {
        
palabra = palabra.toLowerCase().replaceAll("\\s+", "");
    
int izquierda = 0;
int derecha = palabra.length() - 1;
        
while (izquierda < derecha) {
            
if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
return false;
}

izquierda++;
derecha--;
}
return true;
    }
}
