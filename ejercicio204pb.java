import java.util.Scanner;

public class ejercicio204pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite un valor en dolares: ");
int dolares = scanner.nextInt();
scanner.close();
        
double bolivianos = dolares*8.08;
        
System.out.println(dolares+" dolares equivalen a: $"+bolivianos+" bolivianos");
    }
}