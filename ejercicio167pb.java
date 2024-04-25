import java.util.*;

public class ejercicio167pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int total = 0;
int cantidadNumeros = 0;
        
System.out.println("Ingresa una lista de números positivos (para terminar, teclea 0): ");
int numero = scanner.nextInt();
        
while (numero != 0) {
            
if (numero > 0) {
total += numero;
cantidadNumeros++;
            
} else {
System.out.println("Por favor, ingresa solo números positivos.");
}
numero = scanner.nextInt();
}
if (cantidadNumeros == 0) {
System.out.println("No se ingresaron números válidos para calcular el promedio.");
        
} else {
double promedio = (double) total / cantidadNumeros;
System.out.printf("El promedio de los números ingresados es: %.2f\n", promedio);
}
scanner.close();
    }
}
