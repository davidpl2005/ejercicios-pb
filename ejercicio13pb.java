//13.Introducir tres números por teclado mostrar los últimos dígitos de cada número.
import java.util.Scanner;
public class ejercicio13pb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3, ultimoDigito_num1, ultimoDigito_num2, ultimoDigito_num3;

        System.out.println("Ingresa el primer número (mas de 2 cifras): ");
        num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número (mas de 2cifras): ");
        num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número (mas de 2 cifras): ");
        num3 = scanner.nextInt();

        ultimoDigito_num1 = num1 % 10;
        ultimoDigito_num2 = num2 % 10;
        ultimoDigito_num3 = num3 % 10;

        System.out.println("El último dígito del primer número es: " + ultimoDigito_num1);
        System.out.println("El último dígito del segundo número es: " + ultimoDigito_num2);
        System.out.println("El último dígito del tercer número es: " + ultimoDigito_num3);
    }
}
