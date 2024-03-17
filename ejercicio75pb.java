// 75.Algoritmo que indica si un año es bisiesto. Un año es bisiesto si es divisible por
// cuatro, excepto cuando es divisible por 100, a no ser que sea divisible por 400. Así, 1900 no fue bisiesto, pero 2000 sí lo fue.
import java.util.Scanner;
public class ejercicio75pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

int año;

System.out.print("Digite el año que desea verificar si es bisiesto: ");
año = scanner.nextInt();
scanner.close();
        
if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
System.out.println("El año: " + año +" es bisiesto.");

}else{
System.out.println("El año: " + año +" no es bisiesto. ");
        }
    }
}

