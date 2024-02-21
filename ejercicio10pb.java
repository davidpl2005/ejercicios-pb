// 10.Hallar el área de un triángulo
import java.util.Scanner;
public class ejercicio10pb {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int h, b, area;

        System.out.println(" Por favor ingrese la altura del triangulo en cm:");
        h = scanner.nextInt();

        System.out.println(" Por favor ingrese la base del triangulo en cm:");
        b = scanner.nextInt();

        area = (h*b)/2;

        System.out.println(" El area del triangulo es: " + area + " cm2");

        scanner.close();
    }

}
