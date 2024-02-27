//21.Intercambiar los valores de dos variables A y B.
import java.util.Scanner;
public class ejercicio21pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int A, B, temporal;

System.out.println(" Ingrese el valor de la primera variable:");
A = scanner.nextInt();

System.out.println(" Ingrese el valor de la segunda variable:");
B = scanner.nextInt();

System.out.println("Antes de intercambiar las variables:");
System.out.println("A = " + A);
System.out.println("B = " + B);

temporal = A;
A = B;
B = temporal;

System.out.println("\nDespués del intercambiar las variables:");
System.out.println("A = " + A);
System.out.println("B = " + B);
scanner.close();

}
    
}
