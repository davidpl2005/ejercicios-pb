import java.util.Scanner;

public class ejercicio3pb {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h, b, area;
    
    System.out.println(" Ingrese la altura del triangulo:" );
    h = scanner.nextInt();

    System.out.println(" Ingrese la base del triangulo: ");
    b = scanner.nextInt();

    area = (h * b) / 2;

    System.out.println(" El area del triangulo con altura: " + h + "cm " + " y base: " + b + "cm " + " es: " + area + "cm" );
    scanner.close();
    }
}
