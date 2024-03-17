// 73.A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a
// 1000, por encima de 1000 y hasta 2000 el 5% del adicional, y por encima de 2000
// el 3% del adicional. Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo.
import java.util.Scanner;
public class ejercicio73pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

double sueldo, sueldo_Neto;
        
System.out.print("Ingrese el sueldo del trabajador: ");
sueldo = scanner.nextDouble();
scanner.close();
        
double descuento = 0;
        
if (sueldo <= 1000) {
descuento = sueldo * 0.10;
        
} else if (sueldo > 1000 && sueldo <= 2000) {
descuento = 1000 * 0.10 + (sueldo - 1000) * 0.05;
        
} else {
descuento = 1000 * 0.10 + 1000 * 0.05 + (sueldo - 2000) * 0.03;
}
        
sueldo_Neto = sueldo - descuento;
        
System.out.println("El descuento aplicado es: " + descuento);
        
System.out.println("El sueldo neto que recibe el trabajador es: " + sueldo_Neto);
    }
}