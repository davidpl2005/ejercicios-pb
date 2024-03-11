//53.Calcule el área de un cuadrado.
import java.util.Scanner;
public class ejercicio53pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int lado,area;

System.out.println(" Por favor ingrese la longitud de un lado del cuadrado:");
lado = scanner.nextInt();

area = lado * lado;

System.out.println(" El area de un cuadrado con la longitud de uno de sus lados de: " + lado + " es: " + area + " unidades cuadradas");
scanner.close();
}  
}
