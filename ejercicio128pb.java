//  128. Programa para determinar si el año (en formato de 4 dígitos) indicado por el
// usuario es bisiesto (todo año múltiplo de 4 es bisiesto, excepto aquellos múltiplos
// de 100, aunque si también son múltiplos de 400, entonces, sí serán bisiestos. Ej. 2000 si es bisiesto, pero 1800 no).

import java.util.*;

public class ejercicio128pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa un año (4 dígitos): ");
int año = scanner.nextInt();
        
if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
System.out.println( "El año "+ año + " es bisiesto.");
        
} else {
System.out.println("El año "+ año + " no es bisiesto.");
}
scanner.close();
    }
}