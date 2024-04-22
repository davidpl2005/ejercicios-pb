// 130. Programa que calcule el monto total a pagar por mes, si el monto será pagado
// en un plazo de 12 ó 24 meses, tomando en cuenta que por cada mes se aplica un
// 2% deinterés sobre el saldo. Adicionalmente mostrar el total a pagar.

import java.text.DecimalFormat;
import java.util.Scanner;

public class ejercicio130pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
DecimalFormat df = new DecimalFormat("0.00");
        
System.out.print("Ingresa el monto a pagar: ");
double monto = scanner.nextDouble();
int plazo;
        
do {System.out.print("Selecciona el plazo de pago (12 o 24 meses): ");
plazo = scanner.nextInt();
            
if(plazo != 12 && plazo != 24){
System.out.println("Plazo de pago no válido. Debes seleccionar 12 o 24 meses.");
}
        
}while(plazo != 12 && plazo != 24);
double saldo = monto/plazo;
double totalPago = 0;
        
for (int i = 0; i < plazo; i++) {
double interes = saldo * 0.02;
            
saldo += interes;
            
totalPago += saldo;
            
System.out.println("Mes " + (i + 1) + ": Pago mensual $" + df.format(saldo));
}
System.out.println("El total a pagar en " + plazo + " meses es $" + df.format(totalPago));
scanner.close();
    }
}