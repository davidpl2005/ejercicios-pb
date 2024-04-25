import java.util.Scanner;

public class ejercicio142pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite un número: ");
int num = scanner.nextInt();
        
System.out.print("Digite el exponente para el número anterior: ");
int x = scanner.nextInt();
scanner.close();
        
System.out.println(num+"^"+x+" = "+(Math.pow(num, x)));
    }
}
