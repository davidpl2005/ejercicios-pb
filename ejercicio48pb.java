// 48.Facilite el ingreso de dos números enteros y/o reales, muestre su suma, resta,
// multiplicación, división y el resto (módulo) de la división.
import java.util.Scanner;
public class ejercicio48pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int numero1, numero2;
int suma, resta, multiplicacion,division, resto;

System.out.println(" Por favor ingrese un numero entero o real:");
numero1 = scanner.nextInt();

System.out.println(" Por favor ingrese el segundo numero entero o real:");
numero2 = scanner.nextInt();

suma = numero1 + numero2;
resta = numero1 - numero2;
multiplicacion = numero1 * numero2;
division = numero1 / numero2;
resto = numero1 % numero2;

System.out.println("¡RESULTADOS!\n");
System.out.println(" Los numero ingresados son: " + numero1 + " y " + numero2);
System.out.println(" La suma de los 2 numeros es: " + suma);
System.out.println(" La resta entre los 2 numeros es: " + resta);
System.out.println(" La multiplicacion de los numeros es: " + multiplicacion);
System.out.println(" La division entre los dos numeros es: " + division);
System.out.println("Resto de la división (módulo): " + resto);
scanner.close();
}   
    
}
