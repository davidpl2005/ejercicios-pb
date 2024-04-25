import java.util.*;

public class ejercicio154pb {
public static void main(String[] args) {
        
String frase = "Hola que tal";
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa tu nombre: ");
String nombreUsuario = scanner.nextLine();
scanner.close();
        
String mensajeCompleto = frase + " " + nombreUsuario;
System.out.println("Hola que tal, " + nombreUsuario);
System.out.println("Mensaje completo: " + mensajeCompleto);
    }
}
