//11. Hallar el área de un rectángulo
import java.util.Scanner;
public class ejercicio11pb {
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    int h, b, area;

    System.out.println(" por favor ingrese la altura de su rectangulo en cm:");
    h = scanner.nextInt();

    System.out.println(" Por favor ingrese la base de su rectangulo en cm:");
    b = scanner.nextInt();

    area = h * b;

    System.out.println(" El area de su rectangulo es: " + area + " cm2");
    scanner.close();
    }
    
}
