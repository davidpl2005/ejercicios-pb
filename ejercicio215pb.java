import java.util.Scanner;

public class ejercicio215pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.println("Ingrese el kilometraje de la última vez que se reportó:");
double kilometrajeAnterior = scanner.nextDouble();
        
System.out.println("Ingrese el kilometraje actual:");
double kilometrajeActual = scanner.nextDouble();
        
System.out.println("Ingrese los litros de gasolina que se repostaron la última vez:");
double litrosAnteriores = scanner.nextDouble();
        
System.out.println("Ingrese la cantidad de gasolina actual en litros:");
double litrosActuales = scanner.nextDouble();
scanner.close();
        
double distanciaRecorrida = kilometrajeActual - kilometrajeAnterior;
        
double gasolinaConsumida = litrosActuales - litrosAnteriores;
        
double consumoMedio = (gasolinaConsumida / distanciaRecorrida) * 100;
        
System.out.println("El consumo medio del coche en litros por cada 100 kilómetros es: " + consumoMedio);   
    }
}
