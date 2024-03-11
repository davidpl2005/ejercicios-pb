//42.Una naranja tiene la capacidad de producir 0.05 voltios. Si un sistema de
// iluminación requiere de x kilovoltios par a su funcionamiento. Cuántas naranjas realizan el trabajo deseado. 
// Adicionalmente, si cada naranja pesa en promedio 6 gramos. ¿Cuántas toneladas son necesarias?
import java.util.Scanner;
public class ejercicio42pb {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double voltajeNecesario,voltaje_Voltios;
double peso_Naranjas, toneladasNaranjas;
int naranjasNecesarias;

System.out.print(" Ingrese el voltaje necesario en: (kilovoltios): ");
voltajeNecesario = scanner.nextDouble();

// Conversion de kilovoltios a voltios
voltaje_Voltios = voltajeNecesario * 1000;

naranjasNecesarias = (int) Math.ceil(voltaje_Voltios / 0.05);

peso_Naranjas = naranjasNecesarias * 6;

toneladasNaranjas = peso_Naranjas / 1000000;

System.out.println(" Las naranjas necesarias para el sistema de iluminacion son: " + naranjasNecesarias + " naranjas");
System.out.println(" Las toneladas de naranjas necesarias son: " + toneladasNaranjas + " toneladas");
scanner.close();
    }
}
