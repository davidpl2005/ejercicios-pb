//57.Crear una función que reciba un número cualquiera y que devuelva como resultado la suma de sus dígitos.
import java.util.Scanner;
public class ejercicio57pb {
public static void main(String[] args) throws Exception {
        
Scanner scanner = new Scanner(System.in);

System.out.println("Ingrese un numero: ");
int num = scanner.nextInt();
        
int sumaN = 0;
int numeroA = Math.abs(num);

while (numeroA != 0) {
int digito = numeroA % 10;
sumaN += digito;
numeroA /= 10;
}

System.out.println("La suma de los dígitos es: " + sumaN);
scanner.close();
    }
}

