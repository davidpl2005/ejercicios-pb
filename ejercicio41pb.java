//41.El cabello de los seres humanos crece en promedio medio centímetros por mes. Si una persona no cortará 
// nunca su cabello desde su nacimiento determinar según la edad ingresada cuántos metros mide la caballera?.
import java.util.Scanner;
public class ejercicio41pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double centimetros_por_mes = 0.5;
double años_a_meses,edad, longitud_final;

System.out.println(" Por favor ingrese su edad: ");
edad = scanner.nextInt();

años_a_meses = edad * 12;

longitud_final = años_a_meses * centimetros_por_mes; 

System.out.println(" una persona de: " + edad + " años que nunca a cortado su cabello deberia tener un alongitud de: " + longitud_final + " centimetros");
scanner.close();
}
}
