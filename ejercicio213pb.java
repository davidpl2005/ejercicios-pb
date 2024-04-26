import java.util.Scanner;

public class ejercicio213pb {
public static void main(String[] args) {
    
Scanner scanner = new Scanner(System.in);
        
System.out.println("Ingrese el tiempo en minutos para el lunes:");
int tiempoLunes = scanner.nextInt();
        
System.out.println("Ingrese el tiempo en minutos para el miércoles:");
int tiempoMiercoles = scanner.nextInt();
        
System.out.println("Ingrese el tiempo en minutos para el viernes:");
int tiempoViernes = scanner.nextInt();
scanner.close();
        
int tiempoTotal = tiempoLunes + tiempoMiercoles + tiempoViernes;
        
double tiempoPromedioDiario = tiempoTotal / 3.0;
        
double tiempoPromedioSemanal = tiempoPromedioDiario * 3;
        
System.out.println("El tiempo promedio semanal es: " + tiempoPromedioSemanal + " minutos");
    }
}
