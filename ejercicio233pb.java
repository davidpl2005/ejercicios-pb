import java.util.Scanner;

public class ejercicio233pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int totalNumeros, numero;
        
System.out.print("Ingrese la cantidad de números a convertir: ");
totalNumeros = scanner.nextInt();
        
for (int i = 0; i < totalNumeros; i++) {
            
System.out.print("Ingrese un número: ");
numero = scanner.nextInt();
            
if (numero < 0) {
numero = Math.abs(numero);
}
System.out.println("Número convertido a positivo: " + numero);
}
scanner.close();
    }
}