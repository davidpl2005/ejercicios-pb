import java.util.Scanner;

public class ejercicio236pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int num1, num2;
        
do {
            
System.out.print("Ingrese el primer número (mayor que cero): ");
num1 = scanner.nextInt();
            
System.out.print("Ingrese el segundo número (mayor que el primero): ");
num2 = scanner.nextInt();
        
} while (num1 <= 0 || num2 <= num1);
        
System.out.println("Números pares entre " + num1 + " y " + num2 + ":");
        
for (int i = num1; i <= num2; i++) {

if (i % 2 == 0) {
                
System.out.print(i + " ");
    }
}
scanner.close();
    }
}