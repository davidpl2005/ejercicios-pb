// 45.Crear un función que reciba un número real y devuelva un número entero con el
// valor:-1 si el número es negativo, 1 si el número es positivo o 0 si es cero.
import java.util.Scanner;
public class ejercicio45pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

double numeroReal;
int resultado;

System.out.print("Ingresa un número real: ");
numeroReal = scanner.nextDouble();
        
resultado = determinarSigno(numeroReal);
System.out.println("El resultado es: " + resultado);
scanner.close();
    
}
public static int determinarSigno(double numero) {

if (numero < 0) {
return -1;
} else if (numero > 0) {
return 1;
} else {
return 0;
        }
    }
}
