//78.Dado un monto calcular el descuento considerando que por encima de 10000 el
// descuento es el 20% y por debajo de 10000 el descuento es el 10%.

import java.util.Scanner;

public class ejercicio78pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

double monto;
        
System.out.print("Digite el monto para calcular el descuento: ");
monto = scanner.nextDouble();
        
scanner.close();
        
double descuento;
        
if(monto < 10000){
descuento = (monto * 0.1);
        
}else{
descuento = (monto * 0.2);
}

System.out.println("El descuento aplicado es de: "+(int)descuento);
System.out.println("El monto ingresado es: "+(int)monto);
System.out.println("El total aplicado el descuento es: "+(int)(monto-descuento));
    }
}
