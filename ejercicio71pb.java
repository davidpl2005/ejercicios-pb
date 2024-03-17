//71.Hacer un programa que realice la serie fibonacci-> 11 23 5 8 13...
import java.util.Scanner;
public class ejercicio71pb {
public static void main(String[] args) {
            
Scanner scanner = new Scanner(System.in);

int limite;
            
System.out.print("Digite el número hasta el cual desea generar la serie de Fibonacci: ");
limite = scanner.nextInt();

int a = 0, b = 1;
scanner.close();
            
System.out.print("Serie de Fibonacci hasta " + limite + ": "  + b + " ");
int c = a + b;
            
while (c <= limite) {
System.out.print(c + " ");
a = b;
b = c;
c = a + b;

        }
    }
}

