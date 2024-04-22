// 118. Escribir un programa que pida los montos de 10 artículos (de una tienda) y
// muestre en pantalla el monto total a pagar.

import java.util.Scanner;
public class ejercicio118pb{
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
double totalPagar = 0;
        
System.out.println("Ingresa los montos de los 10 artículos:");
        
for (int i = 1; i <= 10; i++) {
            
System.out.print("Monto del artículo " + i + ": ");
double monto = scanner.nextDouble();

totalPagar += monto;

}scanner.close();
        
System.out.println("El monto total a pagar es: " + totalPagar);
    }
}
