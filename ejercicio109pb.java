// 109. Programa que aplique un descuento de 10% sobre el monto de una venta (dado
// por el usuario), sólo si ésta es mayor a 1000 pesos. Mostrar el monto neto de la venta.

import java.util.Scanner;

public class ejercicio109pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite el valor de la venta: ");
int valor = scanner.nextInt();
        
scanner.close();

if(valor > 1000){
double descuento = valor * 0.10;

System.out.println("Descuento: $ " + descuento);

System.out.println("Valor de la venta: $ " + valor);

System.out.println("Total a pagar: $ "+(valor-descuento));
        
}else{
System.out.println(" Total a pagar: $ "+ valor);
        }
    }
}
