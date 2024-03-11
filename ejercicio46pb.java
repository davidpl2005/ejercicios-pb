// 46.Que permita leer el valor correspondiente a una distancia en millas y las visualice
// expresadas en metros. Sabiendo que 1 milla marina equivale a 1852 metros.
import java.util.Scanner;
public class ejercicio46pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int distancia;
int millas = 1852;
int millas_a_metros;

System.out.println(" Por favor ingrese la distancia recorrida en millas:");
distancia = scanner.nextInt();

millas_a_metros = distancia * millas;

System.out.println(" La distancia en millas es de: " + distancia + " millas y equivale a: " + millas_a_metros + " metros");
scanner.close();
}    
}
