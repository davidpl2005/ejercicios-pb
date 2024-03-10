//29.Crear una función que permita calcular el cubo de un número real (float)
import java.util.Scanner;
public class ejercicio29pb {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

float numero;

System.out.println(" Por favor ingrese un numero real: "); 
numero = scanner.nextFloat();
System.out.println(" El numero ingresado es: " + numero + " y elevado al cubo es: " + calcularCubo(numero));
scanner.close();
}

public static float calcularCubo(float numero) {
   
float cubo = numero * numero * numero;
 return cubo;
}
}