//55.Desarrolle una función que reciba un número y devuelva el valor 1 si es un número primo o 0 en caso contrario.
import java.util.Scanner;
public class ejercicio55pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

System.out.print("Introduzca un número: ");
int numero = scanner.nextInt();

int resultado = esPrimo(numero);

scanner.close();

if (resultado == 1) {
System.out.println("El número " + numero + " es primo");
        
} else {
System.out.println("El número " + numero + " no es primo");
}
}

public static int esPrimo(int numero) {
if (numero <= 1) {
return 0;
}

for (int i = 2; i <= Math.sqrt(numero); i++) {
if (numero % i == 0) {
return 0;
}
}
return 1;
    }

}

  