import java.util.*;

public class ejercicio178pb {
public static void main(String[] args){
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Introduce la duración de la llamada en minutos: ");
        
int duracionLlamada = scanner.nextInt();
scanner.close();
        
double costoTotal = 0;
        
if (duracionLlamada <= 3) {
costoTotal = 3.00;
        
} else if (duracionLlamada <= 7) {
costoTotal = 3.00 + (duracionLlamada - 3) * 1.5;
        
} else {
costoTotal = 3.00 + 4 * 1.5 + (duracionLlamada - 7) * 3.00;
    }
System.out.println("El costo total de la llamada es: $" + costoTotal);
    }
}
