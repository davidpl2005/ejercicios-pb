// 104. Crear un programa que halle la raíz cuadrada de un número. Ejemplo el usuario
// deberá indicar el número (por ejemplo y el índice de la raíz ( 3 por ejemplo para la
// raíz cúbica). NOTA. Hallar la raíz cúbica de 2 es lo mismo que elevar 2 a 1/3.

import java.util.Scanner;

public class ejercicio104pb {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.print("Digite un numero: ");
double numero = scanner.nextInt();
        
System.out.print("Digite el indice de la raiz: ");
double indice = scanner.nextInt();
        
scanner.close();
        
double raiz = Math.pow(numero, 1/indice);
System.out.println((int)numero + " ^1/" + (int)indice + " = " + raiz);
    }
}