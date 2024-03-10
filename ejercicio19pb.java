//19.Introducir el sueldo básico de un empleado por teclado, hallar el total ganado
//considerando que debe introducir el monto por horas extras, considerar un
//descuento del 20%. Desplegar el sueldo básico, el total del descuento y el totalganado.
import java.util.Scanner;
public class ejercicio19pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double sueldo, horas_extras, monto, total_ganado, total_final, aplicar_descuento, monto_horas_extras;
double descuento = 0.20;

System.out.println(" Por favor ingrese el sueldo basico del empleado: ");
sueldo = scanner.nextDouble();

System.out.println(" Ingrese por favor la cantidad de horas extras trabajadas:");
horas_extras = scanner.nextDouble();

System.out.println(" Por favor ingrese el monto por cada hora extra:");
monto = scanner.nextDouble();

total_ganado = (horas_extras * monto) + sueldo;

monto_horas_extras = horas_extras*monto;

aplicar_descuento = total_ganado *descuento;

total_final = total_ganado - aplicar_descuento;

System.out.println(" El sueldo basico del empleado es: " + sueldo +"\n");
System.out.println(" El monto por las horas extras trabajadas es de: " + monto_horas_extras +"\n");
System.out.println(" El total del descuento del sueldo del empleado es: " + aplicar_descuento + "\n");
System.out.println(" El total ganado aplicado el descuento y las horas extras es de: " + total_final + "\n");


scanner.close();
}
}
