// 50.Facilite el ingreso de tres números enteros y/o reales, muestre su respectiva suma y multiplicación
import java.util.Scanner;
public class ejercicio50pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int numero1, numero2, numero3;
int suma, multiplicacion;

System.out.println(" Ingrese el primer numero real o entero:");
numero1 = scanner.nextInt(); 

System.out.println(" Ingrese el segundo numero real o entero:");
numero2 = scanner.nextInt();

System.out.println(" Ingrese el tercer numero real o entero:");
numero3 = scanner.nextInt();

suma = numero1+ numero2+ numero3;
multiplicacion = numero1 * numero2 * numero3;

System.out.println("¡OPERACIONES!\n");
System.out.println(" Los numero ingresados son: " + numero1 +", " + numero2 + " y " + numero3);
System.out.println(" La suma de los numeros es: " + suma);
System.out.println(" La multiplicacion de los numeros es: " + multiplicacion);
scanner.close();
}    
}
