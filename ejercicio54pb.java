// 54.Permite introducir una medida expresada en centímetros y la convierte en pulgadas (1pulgada = 2,54 centímetros).
import java.util.Scanner;
public class ejercicio54pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double centimetros,centimetros_a_pulgadas;
double pulgadas = 2.54;

System.out.println(" Ingrese la cantidad de centimetros a convertir:");
centimetros = scanner.nextDouble();

centimetros_a_pulgadas = centimetros / pulgadas;

System.out.println(" La cantidad de centimetros ingresados es: " + centimetros + " Cm " + " y equivale a: " + centimetros_a_pulgadas + " pulgadas");
scanner.close();
}
}
