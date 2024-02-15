import java.util.Scanner;

public class ejercicio2pb {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String texto;

    System.out.println(" Ingrese un texto: ");
    texto = scanner.nextLine();

    System.out.println(" El texto ingresado es: " + texto);

    scanner.close();
}
}
