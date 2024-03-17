// 81.Desarrolle el código fuente de un programa que permita calcular el área de un
// círculo, adicional visualizar “DATOS ERRÓNEOS”, si el área es mayor a 5000
import java.util.Scanner;
public class ejercicio81pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

double radio;
        
System.out.print("Ingrese el radio del círculo: ");
radio = scanner.nextDouble();
scanner.close();
        
double area = Math.PI * radio * radio;

if (area > 5000) {
System.out.println("DATOS ERRÓNEOS");
}else{
System.out.println("El área del círculo es: " + area);   
}
    }
}