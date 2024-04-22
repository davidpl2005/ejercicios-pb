//  122. Modificar el programa anterior para que en lugar de leer 5 números, se puedan
// leer tantos números como el usuario quiera, hasta que se teclee un cero.

import java.util.Scanner;

public class ejercicio122pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int n, suma = 0, i = 1;
        
do {
System.out.print("Digite el número "+i+": ");
            
n = scanner.nextInt();

suma+=n;
i++;
        
} while (n!=0);
        
scanner.close();
System.out.println("\nLa suma de los numeros ingresados es: "+suma);
    }
}