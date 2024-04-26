import java.util.Scanner;

public class ejercicio210pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingrese el monto presupuestal total: ");
double montoTotal = scanner.nextDouble();
scanner.close();
        
double porcentajeGinecologia = 0.4;
        
double porcentajeTraumatologia = 0.3;
        
double porcentajePediatria = 0.3;
        
double montoGinecologia = montoTotal * porcentajeGinecologia;
        
double montoTraumatologia = montoTotal * porcentajeTraumatologia;
        
double montoPediatria = montoTotal * porcentajePediatria;
        
System.out.println("Cantidad de dinero que recibirá Ginecología: $" + montoGinecologia);
System.out.println("Cantidad de dinero que recibirá Traumatología: $" + montoTraumatologia);
System.out.println("Cantidad de dinero que recibirá Pediatría: $" + montoPediatria);
    }
}
