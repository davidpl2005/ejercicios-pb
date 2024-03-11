//37.Hacer lo mismo que el ejercicio anterior pero ahora suponer que después de una
// hora de estacionamiento si los minutos no excedan los 10, no se le cobra la hora;
// es decir, si el cliente ocupa el estacionamiento una hora 8 minutos, se le cobra sólo
// una hora, otro ejemplo sería si el cliente ocupa el estacionamiento 2 horas 15 minutos, se le cobra 3 horas de estacionamiento
import java.util.Scanner;
public class ejercicio37pb {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        
int horas, minutos, total_pagar;
int tarifa = 1500;

System.out.println("Ingrese la cantidad de horas: ");
horas = scanner.nextInt();

System.out.println("Ingrese la cantidad de minutos: ");
minutos = scanner.nextInt();

int totalHoras;

if (minutos <= 10) {
totalHoras = horas;
} else {
totalHoras = horas + 1;
}
total_pagar = totalHoras*tarifa;

System.out.println(" El total a pagar es: " + totalHoras + " horas que equivalen a: " + total_pagar + " pesos");
scanner.close();
    }
}
