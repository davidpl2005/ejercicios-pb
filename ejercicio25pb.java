//25.Programa que de acuerdo a una cantidad de grados centígrados ingresadas por
//teclado, realice la conversión a grados fahrenheit. (Multiplica por 9, divide entre 5, después suma 32)
import java.util.Scanner;
public class ejercicio25pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int grados_celsius, conversion, grados_fahrenheit, suma;

System.out.println(" Por favor ingrese la cantidad de grados celsius: ");
grados_celsius = scanner.nextInt();

grados_fahrenheit = (grados_celsius * 9)/5 + 32;

System.out.println(" La cantidad de grados celsius ingresados es: " + grados_celsius + " °C"  + "\n" + " La conversion a grados fahrenheit es: " + grados_fahrenheit + " °F");
}
}
