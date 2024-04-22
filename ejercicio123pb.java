//  123. Programa que calcula el capital final de un interés simple de forma diaria, de
// acuerdo a los datos dados por el usuario(capital, interés y días). El resultado se mostrará en pantalla.

import java.util.*;

public class ejercicio123pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa el capital inicial: ");
double capitalInicial = scanner.nextDouble();
        
System.out.print("Ingresa la tasa de interés diaria (%): ");
double tasaInteresDiaria = scanner.nextDouble() / 100; 
        
System.out.print("Ingresa el número de días: ");
int dias = scanner.nextInt();
scanner.close();
        
double capitalFinal = capitalInicial * (tasaInteresDiaria * dias);
        
System.out.println("El capital final después de " + dias + " días es: " + capitalFinal);
    }
}