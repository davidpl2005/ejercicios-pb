import java.util.Scanner;

public class ejercicio201pb {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la calificación del primer parcial: ");
        double parcial1 = scanner.nextDouble();
        
        System.out.print("Ingrese la calificación del segundo parcial: ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del tercer parcial: ");
        double parcial3 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();

        System.out.print("Ingrese la calificación del trabajo final: ");
        double trabajoFinal = scanner.nextDouble();
        scanner.close();
        
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        double calificacionFinal = 0.55 * promedioParciales + 0.30 * examenFinal + 0.15 * trabajoFinal;
        
        System.out.println("La calificación final del alumno en Algoritmos es: " + calificacionFinal);
    }
}