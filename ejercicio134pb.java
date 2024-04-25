import java.util.*;

public class ejercicio134pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int numero1, numero2, numero3;
        
do {
            
System.out.print("Ingrese el primer número entero: ");
numero1 = scanner.nextInt();
            
System.out.print("Ingrese el segundo número entero: ");
numero2 = scanner.nextInt();
            
System.out.print("Ingrese el tercer número entero: ");
numero3 = scanner.nextInt();
            
if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
System.out.println("Por favor, ingrese tres números diferentes.");
}
        
} while (numero1 == numero2 || numero1 == numero3 || numero2 == numero3);
        
int mayor = Math.max(Math.max(numero1, numero2), numero3);
        
int menor = Math.min(Math.min(numero1, numero2), numero3);
        
System.out.println("El mayor número es: " + mayor);
        
System.out.println("El menor número es: " + menor);
scanner.close();
    }
}