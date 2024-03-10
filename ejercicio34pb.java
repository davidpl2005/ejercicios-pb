// 34.Dado el monto de una compra calcular el descuento considerado. descuento es
// 10% si el monto es mayor a 1000 pesos, descuento es 20%, si el monto es mayor a
// 500 pesos y menor o igual a 1000 pesos, no hay descuento si el monto es menor o igual a 500 pesos 
import java.util.Scanner;
public class ejercicio34pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double monto, descuento_mayor, descuento_menor, descunto10, descuento20;

System.out.println(" Por compras mayores a 1000 pesos tendra un descuento del 10 % ");
System.out.println(" Por compras mayores a 500 y menores que 1000 pesos tendra un descuento del 20 % \n");
System.out.println(" Por favor ingrese el monto de la compra:");
monto = scanner.nextDouble();

descuento_menor = monto - (monto * 0.10);
descuento_mayor = monto - (monto * 0.20);
descunto10 = monto * 0.10;
descuento20 = monto * 0.20;
if(monto > 1000){
System.out.println(" El monto inicial de la compra es:" + monto + "\n tiene un descuento del 10 % que es:" + descunto10 + " pesos el valor a pagar aplicado el descuento es: " + descuento_menor + " pesos");
}if (monto > 500 && monto <= 1000){
System.out.println(" El monto inicial de la compra es:" + monto + "\n tiene un descuento del 20 % que es:" + descuento20 + " pesos el valor a pagar aplicado el descuento es: " + descuento_mayor + " pesos");
}if(monto <= 500){
System.out.println(" El valor final a pagar es: " + monto + " pesos");
}
scanner.close();
}
}