import java.util.Scanner;

public class ejercicio212pb {
public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
    double porcentajeGananciaVendedor = 0.12,impuestoLocal = 0.06;
        
    System.out.println("Ingrese el coste total del vehículo:");
    double costeVehiculo = scanner.nextDouble();
        
    double gananciaVendedor = costeVehiculo * porcentajeGananciaVendedor;
        
    double impuestos = costeVehiculo * impuestoLocal;
        
    double costeConsumidor = costeVehiculo + gananciaVendedor + impuestos;
        
    System.out.println("El coste para el consumidor es: " + costeConsumidor);
    scanner.close();
    }
}