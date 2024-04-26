import java.util.*;

public class ejercicio174pb {
public static void main(String[] args) {
        
Scanner scanner= new Scanner(System.in);
        
System.out.print("Ingrese el nombre completo del empleado:");
String nombreCompleto = scanner.nextLine().toLowerCase();
        
System.out.print("Ingrese el área o departamento del empleado:");
String areaDepartamento = scanner.nextLine().toLowerCase();
        
scanner.close();
        
String[] nombreSplit = nombreCompleto.split(" ");
String nombreUsuario = "";
        
for (String palabra : nombreSplit) {
nombreUsuario += palabra.charAt(0);
}
        
nombreUsuario = areaDepartamento.substring(0, 2) + nombreUsuario;
        
System.out.println("Nombre de usuario generado: " + nombreUsuario);
    }
}