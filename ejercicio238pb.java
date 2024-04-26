import java.util.Scanner;

public class ejercicio238pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int numero, suma = 0;
        
System.out.print("Ingrese un número: ");
numero = scanner.nextInt();
        
int num = numero;
        
while (num != 0) {
            
suma += num % 10;
num /= 10;
}
        
System.out.println("La suma de los elementos del número " + numero + " es: " + suma);
scanner.close();
    }
}