// 129. Programa que a partir del número del mes (1-12) y el año, indique el número
// total de días que corresponden a cada mes, el número de mes será indicado por el usuario.

import java.util.Scanner;

public class ejercicio129pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
System.out.print("Ingresa el número de mes (1-12): ");
int mes = scanner.nextInt();
        
System.out.print("Ingresa el año: ");
int año = scanner.nextInt();
        
int dias = diasPorMes[mes-1];
        
if (dias != -1) {
            
System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
} else {
            
System.out.println("Mes no válido. Debes ingresar un número de mes entre 1 y 12.");
}
scanner.close();
}
}