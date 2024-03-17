// 80.Desarrolle el código fuente de un programa que permita ingresar un dato entero y
// un dato real y visualizar los datos ingresados.
import java.util.Scanner;
public class ejercicio80pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

int numero_Entero;
double numero_Real;
        
System.out.print("Ingrese un número entero: ");
numero_Entero = scanner.nextInt();

System.out.print("Ingrese un número real: ");
numero_Real = scanner.nextDouble();
scanner.close();
       
System.out.println("El número entero ingresado es: " + numero_Entero);
System.out.println("El número real ingresado es: " + numero_Real);
    }
}