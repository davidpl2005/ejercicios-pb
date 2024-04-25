import java.util.*;

public class ejercicio132pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
double saldoInicial = 1000;
        
double saldoActual = saldoInicial;
        
int opcion;
        
double cantidad;
        
do {
           
System.out.println("Seleccione una opción:");
System.out.println("1. Depósito");
System.out.println("2. Retiro");
System.out.println("3. Salir");

opcion = scanner.nextInt();

switch (opcion) {
                
case 1:
System.out.print("Ingrese la cantidad a depositar: ");
cantidad = scanner.nextDouble();
saldoActual += cantidad;
System.out.println("Depósito exitoso.");
break;
                
case 2:
System.out.print("Ingrese la cantidad a retirar: ");
cantidad = scanner.nextDouble();
                    
if (cantidad <= saldoActual) {
saldoActual -= cantidad;
                        
System.out.println("Retiro exitoso.");
                    
} else {
System.out.println("Saldo insuficiente.");
}
break;
                
case 3:
System.out.println("Saliendo del cajero...");
break;
default:
                    
System.out.println("Opción inválida. Inténtelo de nuevo.");
}
        
} while (opcion != 3);
System.out.println("Saldo final: $" + saldoActual);
scanner.close();
    }
}