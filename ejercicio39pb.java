// 39.Una persona pasa el 34 por ciento de su vida durmiendo. Dado el año de
// nacimiento, el año actual y el nombre de una persona, imprimir cuántos días ha dormido.
import java.util.Scanner;
public class ejercicio39pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

float año_actual = 2024; 
float año_nacimiento, edad, años_durmiendo, dias_durmiendo;
float porcentaje_durmiendo = 0.34F;
String nombre;

System.out.println(" Por favor ingrese su nombre:");
nombre = scanner.nextLine();

System.out.println(" Por favor ingrese su año de nacimiento:");
año_nacimiento = scanner.nextInt();

edad = año_actual - año_nacimiento;

años_durmiendo = edad * porcentaje_durmiendo;

dias_durmiendo = años_durmiendo * 365;

System.out.println("¡HOLA! " + nombre );
System.out.println(" Su edad es: " + edad + " años " + " y ha dormido un total de: " + años_durmiendo + " años que equivalen a: " + dias_durmiendo + " dias");
scanner.close();
}
}