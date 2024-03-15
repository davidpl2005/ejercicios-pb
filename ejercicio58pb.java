// 58.Dada las horas trabajadas de una persona y el valor por hora. Calcular su salario y visualizarlos.
import java.util.Scanner;
public class ejercicio58pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int horas, valor,salario;

System.out.println(" Por favor ingrese las horas trabajadas:");
horas = scanner.nextInt();

System.out.println(" Por favor ingrese el valor por hora trabajada:");
valor = scanner.nextInt();

salario = horas * valor;

System.out.println(" El salario del empleado segun sus horas trabajadas es: " + salario + " pesos");
scanner.close();
}   
}
