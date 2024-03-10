//22.Introducir un número real, mostrar la parte entera y la parte decimal del número.                        
import java.util.Scanner;
public class ejercicio22pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double numero_real;

System.out.print("Ingrese un número real: ");
numero_real = scanner.nextDouble();

String numeroCadena = String.valueOf(numero_real);

String[] partes = numeroCadena.split("\\.");

String parteEntera = partes[0];
String parteDecimal = partes.length > 1 ? partes[1] : "0";
        
System.out.println("Parte entera: " + parteEntera);
System.out.println("Parte decimal: " + parteDecimal);

scanner.close();
    }
}



