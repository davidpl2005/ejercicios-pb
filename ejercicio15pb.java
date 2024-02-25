//15.Algoritmo que determine si una persona es mayor o menor de edad
import java.util.Scanner;
public class ejercicio15pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int añoActual, añoNacimiento, edad;

añoActual = 2024;

System.out.println(" Por favor ingrese su año de nacimiento: ");
añoNacimiento = scanner.nextInt();

edad = añoActual - añoNacimiento;

if (edad<18) {
System.out.println(" Usted es menor de edad y su edad es: " + edad + " años");
} else {
System.out.println(" Usted es mayor de edad y su edad es: " + edad + " años"); 

scanner.close();
}
}
}
