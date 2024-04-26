import java.util.Scanner;

public class ejercicio229pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int num1, num2;
        
do {
            
System.out.print("Ingrese el primer número: ");
num1 = scanner.nextInt();
            
System.out.print("Ingrese el segundo número: ");
num2 = scanner.nextInt();
            
if (num1 % 2 == 0 && num2 % 2 == 0) {
                
int suma = num1 + num2;
                
System.out.println("La suma de los dos números pares es: " + suma);
            
} else {
System.out.println("Por favor, ingrese dos números pares.");
}
        
} while (num1 != 0 || num2 != 0);
scanner.close();
    }
}