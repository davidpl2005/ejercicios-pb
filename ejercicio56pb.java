// 56.Que exprese en horas, minutos y segundos un tiempo expresado en segundos.
import java.util.Scanner;
public class ejercicio56pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

Double segundos, segundos_a_minutos, segundos_a_horas;

System.out.println(" Por favor ingrese la cantidad de segundos: ");
segundos = scanner.nextDouble();

segundos_a_minutos = segundos / 60;

segundos_a_horas = segundos_a_minutos / 60;

System.out.println(" La cantidad de segundos ingresados es: " + segundos + " segundos");
System.out.println(" Eso equivale a: " + segundos_a_minutos + " minutos");
System.out.println(" Eso equivale a: " + segundos_a_horas + " horas");
scanner.close();
}
    
}