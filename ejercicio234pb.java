import java.util.Scanner;

public class ejercicio234pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int numero, numeroInvertido = 0, numeroOriginal, resto;
        
System.out.print("Ingrese un número: ");
numero = scanner.nextInt();
        
numeroOriginal = numero;
        
while (numero > 0) {
            
resto = numero % 10;
numeroInvertido = numeroInvertido * 10 + resto;
numero = numero / 10;
}
        
if (numeroOriginal == numeroInvertido) {
System.out.println("El número ingresado es capicúa.");
        
} else {
System.out.println("El número ingresado no es capicúa.");
    }
scanner.close();
    }
}