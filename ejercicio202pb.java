import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejercicio202pb {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Ingrese su fecha de nacimiento (Formato: yyyy-MM-dd): ");
    String fechaNacimientoStr = scanner.nextLine();
    scanner.close();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
    LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
        
    LocalDate fechaActual = LocalDate.now();
        
    int edad = calcularEdad(fechaNacimiento, fechaActual);
        
    System.out.println("Su edad es: " + edad + " años.");
    }
    public static int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return fechaActual.getYear() - fechaNacimiento.getYear();
    }
}