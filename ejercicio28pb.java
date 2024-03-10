// 28.Programa que muestre en pantalla una cuenta atrás de números tomando en
// cuenta el número leído de teclado (ej. 7,6,5,4,3,2,1,0).
import java.util.Scanner;
public class ejercicio28pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int numero;

System.out.print(" Por favor ingrese un numero: ");
numero = scanner.nextInt();

 for (int i = numero; i >= 0; i--) {
    System.out.println(i);
}
System.out.println(" Cuenta atrás finalizada");
scanner.close();
}
}
