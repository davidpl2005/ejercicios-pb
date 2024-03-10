// 32.Construir un programa que permita calcular el área de un rectángulo, los datos se
//ingresan en metros y se espera ver los resultados en metros, centímetros y milímetros cuadrados
import java.util.Scanner;
public class ejercicio32pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double base, altura, area_metros, area_centimetros, area_milimetros;

System.out.println(" Por favor ingrese la base en metros del rectangulo: ");
base = scanner.nextDouble();

System.out.println(" Por favor ingrese la altura en metros del rectangulo: ");
altura = scanner.nextDouble();

area_metros = base * altura;

area_centimetros = (area_metros * 100) * 100;

area_milimetros = (area_centimetros * 10) * 10;

System.out.println(" Area del rectangulo: ");
System.out.println(" El area del rectangulo en metros es: " + area_metros + " M^2");
System.out.println(" El area del rectangulo en centimetros es: " + area_centimetros + " Cm^2");
System.out.println(" El area del rectangulo en milimetros es: " + area_milimetros + " mm^2");
scanner.close();
}  
}
