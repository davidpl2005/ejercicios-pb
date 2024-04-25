import java.util.*;

public class ejercicio135pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite la cantidad de números para evaluar: ");
        
int cantNum = scanner.nextInt();
        
int mayor = Integer.MIN_VALUE;
        
int menor = Integer.MAX_VALUE;
        
for (int i = 1; i <= cantNum; i++) {
            
System.out.print("Ingrese el número " + i + ": ");
int numero = scanner.nextInt();
            
mayor = Math.max(mayor, numero);
menor = Math.min(menor, numero);
}
        
System.out.println("El número mayor es: " + mayor);
System.out.println("El número menor es: " + menor);
scanner.close();
    }
}