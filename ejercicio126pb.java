// 126. Programa que de acuerdo a la fecha dada por el usuario en formato AAAA MM
// DD y la muestre en formato texto. Ejemplo: 2012 01 23 deberá ser mostrado como: 23 Enero de 2012.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejercicio126pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa la fecha en formato AAAA MM DD: ");
String fechaStr = scanner.nextLine();
        
DateTimeFormatter formatterInput = DateTimeFormatter.ofPattern("yyyy MM dd");
        
DateTimeFormatter formatterOutput = DateTimeFormatter.ofPattern("dd MMMM 'de' yyyy");
        
LocalDate fecha = LocalDate.parse(fechaStr, formatterInput);
        
String fechaTexto = fecha.format(formatterOutput);
        
System.out.println("Fecha en texto: " + fechaTexto);

scanner.close();
    }
}