import java.util.Scanner;

public class ejercicio161pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite el valor de a: ");
int a = scanner.nextInt();
        
System.out.print("Digite el valor de b: ");
int b = scanner.nextInt();
scanner.close();
        
System.out.println("Valores originales: \na = "+a+"\nb = "+b);
        
int c = a;
a = b; b = c;
        
System.out.println("Valores intercambiados: \na = "+a+"\nb = "+b);
    }
}
