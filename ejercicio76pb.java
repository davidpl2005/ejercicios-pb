//76.Dado un número entero, indicar el número de cifras de ese número ( para el 432 debe indicar 3)
import java.util.Scanner;
public class ejercicio76pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingrese un número entero: ");
int numero = scanner.nextInt();
scanner.close();
        
int cifras = 0,nTemporal = numero;
while (nTemporal != 0) {

nTemporal = nTemporal / 10;
cifras++;
}
System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
}
}
