import java.util.Scanner;

public class ejercicio232pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int totalNumeros, numero,positivos = 0,negativos = 0,neutros = 0;
        
System.out.print("Ingrese la cantidad de números a evaluar: ");
totalNumeros = scanner.nextInt();
        
for (int i = 0; i < totalNumeros; i++) {
            
System.out.print("Ingrese un número: ");
            
numero = scanner.nextInt();
            
if (numero > 0) {
positivos++;
            
} else if (numero < 0) {
negativos++;
            
} else {
neutros++;
 } 
}
        
System.out.println("Cantidad de números positivos: " + positivos);
System.out.println("Cantidad de números negativos: " + negativos);
System.out.println("Cantidad de números neutros: " + neutros);
scanner.close();
    }
}