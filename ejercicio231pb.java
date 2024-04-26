import java.util.Scanner;

public class ejercicio231pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int contador = 0;
        
int suma = 0;
        
while (contador < 10) {
            
System.out.print("Ingrese un número: ");
int numero = scanner.nextInt();
            
if (numero > 0) {
                
System.out.println("Número positivo ingresado: " + numero);
suma += numero;
}
            
contador++;
}
        
System.out.println("La suma de los números positivos es: " + suma);
scanner.close();
    }
}