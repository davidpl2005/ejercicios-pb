//12.Introducir tres números por teclado, hallar el promedio de los tres números, la suma y desplegar del primer número el doble,
// del segundo número el triple y del tercer número el cuadrado.
import java.util.Scanner;
public class ejercicio12pb {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);    
double num1, num2, num3, promedio, suma, doble_num1, triple_num2, cuadrado_num3;
    
System.out.println(" Por favor ingrese el primer numero:");
num1 = scanner.nextInt();

System.out.println(" Por favor ingrese el segundo numero:");
num2 = scanner.nextInt();

System.out.println(" Por favor ingrese el tercer numero:");
num3 = scanner.nextInt();

promedio = (num1 + num2 + num3)/3;
System.out.println(" El promedio de los 3 numeros ingresados es: " + promedio);
    
suma = num1+num2+num3;    
System.out.println(" La suma de los 3 numeros ingresados es: " + suma);

doble_num1 = num1*2;
System.out.println(" El doble del primer numero es:" + doble_num1);

triple_num2 = num2*3;
System.out.println(" El triple del segundo numero es:" + triple_num2);

cuadrado_num3 = num3*4;
System.out.println(" El cuadrado del tercer número es: " + cuadrado_num3);
scanner.close();
  }
}
