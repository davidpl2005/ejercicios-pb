import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ejercicio172pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.println("Ingrese el periodo en formato MM AAAA:");
String periodo = scanner.nextLine();
scanner.close();
        
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM yyyy");
        
LocalDate fecha = LocalDate.parse("01 " + periodo, formatter);
        
for (int i = 0; i < 12; i++) {
            
fecha = fecha.minusMonths(1);

String periodoAnterior = fecha.format(formatter);
System.out.println(periodoAnterior);
        }
    }
}