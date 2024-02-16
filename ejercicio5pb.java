import java.util.Scanner;
public class ejercicio5pb {
  public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    double diagonal_mayor, diagonal_menor, area;

    System.out.println(" Dijite la longitud de la diagonal mayor del rombo: ");
    diagonal_mayor = scanner.nextDouble();

    System.out.println("Dijite la longitud de  la diagonal menor del rombo: ");
    diagonal_menor = scanner.nextDouble();

    area = (diagonal_mayor * diagonal_menor) /2;

    System.out.println(" El area del rombo con diagonal mayor de: " + diagonal_mayor + "cm" +" y diagonal menor de: " + diagonal_menor + "cm" +" es: " + area + "cm");

    }
    
}
