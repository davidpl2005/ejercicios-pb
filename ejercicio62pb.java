// 62.Escriba un programa que tome cada 4 horas la temperatura exterior, leyendola
// durante un periodo de 24 horas. Es decir, debe leer 6 temperaturas. Calcule la
// temperatura media del día, la temperatura más alta y la más baja.
import java.util.Scanner;
public class ejercicio62pb {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        
double sumaTemperaturas = 0;
double temperaturaMaxima = Double.NEGATIVE_INFINITY;
double temperaturaMinima = Double.POSITIVE_INFINITY;
        
for (int i = 0; i < 6; i++) {

double temperatura;

System.out.print("Ingrese la temperatura exterior: ");
temperatura = scanner.nextDouble();

sumaTemperaturas += temperatura;
            
if (temperatura > temperaturaMaxima) {
temperaturaMaxima = temperatura;
}
if (temperatura < temperaturaMinima) {
temperaturaMinima = temperatura;
    }
}
        
double temperaturaMedia = sumaTemperaturas / 6;
        
System.out.println("La temperatura media del día es: " + temperaturaMedia);
System.out.println("La temperatura más alta del día es: " + temperaturaMaxima);
System.out.println("La temperatura más baja del día es: " + temperaturaMinima);
scanner.close();
    }
}
