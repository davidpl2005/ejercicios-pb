// 89.Desarrolle el código fuente de un programa que permita ingresar y leer el valor
// correspondiente a una distancia en metros y las visualice expresadas en km.
import java.util.Scanner;

public class ejercicio89pb {
public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);
        
System.out.print("Digite una distancia expresada em metros: ");
double metros=in.nextDouble();
in.close();
        
double km = metros/1000;
System.out.println(metros+" mts equivalen a: "+km+" km.");
    }
}