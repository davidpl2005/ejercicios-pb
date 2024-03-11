//43.Crear una función que calcule cual es el número menor de dos números enteros
import java.util.Scanner;
public class ejercicio43pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int numero1,numero2;

System.out.println(" Por favor ingrese el primer numero entero:");
numero1 = scanner.nextInt();

System.out.println(" Por favor ingrese el segundo numero entero:");
numero2 = scanner.nextInt();

if (numero1 > numero2) {
System.out.println(" El numero mayor es: " + numero1 + " y el numero menor es: " + numero2);    
} else {
System.out.println(" El numero mayor es: " + numero2 + " y el numero menor es: " + numero1);    
}
scanner.close();
}
}
