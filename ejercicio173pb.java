import java.util.*;

public class ejercicio173pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
double totalPagar = 0;
int cantidadTotal = 0;
        
while (true) {
            
System.out.println("Introduzca la cantidad vendida (o ingrese 0 para terminar):");
int cantidad = scanner.nextInt();
            
if (cantidad == 0) {
break;
}
            
System.out.println("Introduzca el precio:");
double precio = scanner.nextDouble();
            
totalPagar += cantidad * precio;
            
cantidadTotal += cantidad;
        
} scanner.close();
System.out.println("Total a pagar: " + totalPagar);
System.out.println("Cantidad total de productos: " + cantidadTotal);
    }
}
