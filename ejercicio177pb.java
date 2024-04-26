import java.util.*;

public class ejercicio177pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Introduce un número entero: ");
int numero = scanner.nextInt();
scanner.close();
        
System.out.print("Los divisores de " + numero + " son: ");
        
for (int i = numero; i > 0; i--) {
            
if (numero % i == 0) {
                
System.out.print(i + " ");
}
}
}
}