import java.util.Scanner;

public class ejercicio230pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
double num1, num2;
        
do {

System.out.print("Ingrese el primer número (mayor que cero): ");
num1 = scanner.nextDouble();
            
System.out.print("Ingrese el segundo número (mayor que cero y menor que el primero): ");
num2 = scanner.nextDouble();
            
if (num1 <= 0 || num2 <= 0 || num2 >= num1) {
                
System.out.println("Los números ingresados no cumplen las condiciones. Inténtelo de nuevo.");
}
        
} while (num1 <= 0 || num2 <= 0 || num2 >= num1);
        
double resultado = num1 / num2;
        
System.out.println("El resultado de la división es: " + resultado);
scanner.close();
    }
}
