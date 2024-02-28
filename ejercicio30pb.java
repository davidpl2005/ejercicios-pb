// 30.Que permita leer el valor correspondiente a una distancia en kilómetros y las
// visualice expresadas en metros.
import java.util.Scanner;
public class ejercicio30pb {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double metros, kilometros;

System.out.println(" Por favor ingrese la distancia en kilometros: ");
kilometros = scanner.nextDouble();

metros = kilometros * 1000;

System.out.println(" La distancia en kilometros es: " + kilometros + " Km " + " eso equivale a: " + metros + " metros");
scanner.close();

}
    
}
