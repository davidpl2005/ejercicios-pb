import java.util.*;

public class ejercicio150pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa un número entero para descomponer en factores primos: ");
int numero = scanner.nextInt();
        
System.out.print("La descomposición en factores primos de " + numero + " es: ");
int factor = 2;
scanner.close();
        
while (factor <= numero) {
            
if (numero % factor == 0) {
                
System.out.print(factor);
                
numero = numero / factor;
                
if (numero != 1) {
System.out.print("*");
}
} else {
factor++;
}
}
}
}
