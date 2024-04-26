import java.util.Scanner;

public class ejercicio224pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
while (true) {
            
System.out.print("Nombre del alumno (o dejar vacío para salir): ");
String nombre = scanner.nextLine();
            
if (nombre.isEmpty()) {
break;
}
            
double notaPractica, notaProblemas, notaTeorica;
            
System.out.print("Ingrese la nota práctica (0-10): ");
notaPractica = scanner.nextDouble();
            
System.out.print("Ingrese la nota de problemas (0-10): ");
notaProblemas = scanner.nextDouble();
            
System.out.print("Ingrese la nota teórica (0-10): ");
notaTeorica = scanner.nextDouble();
            
if (notaPractica >= 0 && notaPractica <= 10 && notaProblemas >= 0 && notaProblemas <= 10 && notaTeorica >= 0 && notaTeorica <= 10) {
                
double notaFinal = (notaPractica * 0.1) + (notaProblemas * 0.5) + (notaTeorica * 0.4);
                
System.out.println("Alumno: " + nombre);
                
System.out.println("Nota final: " + notaFinal);
            
} else {
System.out.println("Las notas deben estar entre 0 y 10. Por favor, inténtelo de nuevo.");
}
scanner.nextLine();
}
scanner.close();
    }
}