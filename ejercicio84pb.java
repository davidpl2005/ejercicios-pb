//84.Desarrolle el código fuente de un programa que permita ingresar una edad y leer su edad ingresada
import java.util.Scanner;
public class ejercicio84pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

int edad;

System.out.print("Ingrese su edad: ");
edad = scanner.nextInt();
scanner.close();
        
System.out.println("La edad ingresada es: " + edad + " años");
    }
}