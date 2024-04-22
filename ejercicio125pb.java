// 125. Modificar el programa anterior para que el número múltiplo pueda ser leído
// desde un dispositivo externo (teclado por defecto).

import java.util.*;

public class ejercicio125pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa el número para encontrar sus múltiplos de 3: ");
int numero = scanner.nextInt();
        
for (int i = 1; i <= 3000; i++) {
if (i % numero == 0) {
                
System.out.println(i + " es múltiplo de " + numero);
}
}
scanner.close();
    }
}