import java.util.Scanner;

public class ejercicio205pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingrese la cantidad en Bolivianos: ");
double montoBolivianos = scanner.nextDouble();
scanner.close();
        
System.out.print("Ingrese el tipo de cambio actual (1 Boliviano a X Dólares): ");
double tipoCambio = scanner.nextDouble();
        
double dolares = montoBolivianos/tipoCambio;
        
System.out.println("El monto equivalente en Dólares es: " + dolares + " USD");
    }
}