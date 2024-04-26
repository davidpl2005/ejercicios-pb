import java.util.Scanner;

public class ejercicio239pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int numero, suma = 0;
        
System.out.println("Ingrese una serie de números para sumar (Ingrese 999 para finalizar):");
        
do {
            
System.out.print("Ingrese un número: ");
numero = scanner.nextInt();
            
if (numero != 999) {
                
suma += numero;
}
        
} while (numero != 999);
        
System.out.println("La suma de los números ingresados es: " + suma);
scanner.close();
    }
}
