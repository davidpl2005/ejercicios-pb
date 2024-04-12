//87.Desarrolle el código fuente de un programa que permita calcular el área de un
// triángulo equilátero, adicional visualizar “DATOS NO VÁLIDOS”, si el área es mayor a 1000.
import java.util.Scanner;

public class ejercicio87pb {
public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);
        
System.out.print("Ingrese la longitud de un lado del triángulo equilátero: ");
double lado = in.nextDouble();
in.close();
        
double area = (Math.sqrt(3) / 4) * lado * lado;
        
System.out.println("El área del triángulo equilátero es: " + area);
        
if (area > 1000) {
System.out.println("DATOS NO VÁLIDOS");
        }
    }
}