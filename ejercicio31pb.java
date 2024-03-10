//31.Construir un programa que permita calcular el área de un triángulo. El usuario
//ingresará la base y la altura en milímetros y el sistema mostrará los resultados en 
//milímetros, centímetros y metros cuadrados respectivamente.
import java.util.Scanner;
public class ejercicio31pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double base_milimetros, altura_milimetros, area_milimetros, area_centimetros, area_metros, areaMetros_cuadrados;

System.out.println(" Por favor ingrese la base en milimetros del triangulo: ");
base_milimetros = scanner.nextDouble();

System.out.println(" Por favor ingrese la altura en milimetros del triangulo: ");
altura_milimetros = scanner.nextDouble();

area_milimetros = (base_milimetros*altura_milimetros)/2;

// la convercion de milimetros a centimetros es la cantidad de milimetros multiplicado por 0.1
area_centimetros = ((base_milimetros*altura_milimetros)/2) * 0.1;

// la convercion de milimetros a metros es la cantidad de milimetros multiplicado por 0.001
area_metros = ((base_milimetros*altura_milimetros)/2) * 0.001;

System.out.println(" EL area del triangulo es:");
System.out.println(" El area del triangulo en milimetros es: " + area_milimetros + " mm^2");
System.out.println(" El area del triangulo en centimetros es: " + area_centimetros + " cm^2");
System.out.println(" El area del triangulo en metros es: " + area_metros + " metros^2 ");
scanner.close();
}
}
