import java.util.Scanner;

public class ejercicio240pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int num1, num2, resultado = 0;
        
System.out.print("Ingrese el primer número: ");
num1 = scanner.nextInt();
        
System.out.print("Ingrese el segundo número: ");
num2 = scanner.nextInt();
        
for (int i = 0; i < num1; i++) {
resultado += num2;
}
        
System.out.println("El resultado de la multiplicación es: " + resultado);
scanner.close();
    }
}