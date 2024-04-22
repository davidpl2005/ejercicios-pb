// 117. Escribir un programa que lea números indefinidamente hasta que llegue el
// número 0, y antes de finalizar indique la cantidad de números leídos.

import java.util.Scanner;

public class ejercicio117pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int contador = 0;
        
System.out.println("Ingresa números (ingresa 0 para finalizar):");
        
while (true) {
            
int numero = scanner.nextInt();
if (numero == 0) {
break;
}
contador++;
}
scanner.close();
System.out.println("Se han ingresado " + contador + " números.");
    }
}