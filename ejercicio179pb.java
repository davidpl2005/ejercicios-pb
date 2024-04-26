import java.util.*;

public class ejercicio179pb {
public static void main(String[] args){
        
Scanner scanner = new Scanner(System.in);
        
System.out.println("Ingrese la calificación de Matemáticas: ");
double matematicas = scanner.nextDouble();
        
System.out.println("Ingrese la calificación de Inglés: ");
double ingles = scanner.nextDouble();
        
System.out.println("Ingrese la calificación de Español: ");
double espanol = scanner.nextDouble();
scanner.close();
        
double promedio = (matematicas + ingles + espanol) / 3;
        
System.out.println("El promedio de calificaciones es: " + promedio);
        
int materiasAprobadas = 0;
        
int materiasReprobadas = 0;
        
if (matematicas >= 6) {
materiasAprobadas++;
        
} else {
materiasReprobadas++;
        
}if (ingles >= 6) {
materiasAprobadas++;
        
} else {
materiasReprobadas++;
        
}if (espanol >= 6) {
materiasAprobadas++;
        
} else {
materiasReprobadas++;
}
        
System.out.println("Total de materias aprobadas: " + materiasAprobadas);
System.out.println("Total de materias reprobadas: " + materiasReprobadas);
String materiaMenorCalificacion = "Matemáticas";
        
if (ingles < matematicas && ingles < espanol) {
materiaMenorCalificacion = "Inglés";
        
} else if (espanol < matematicas && espanol < ingles) {
materiaMenorCalificacion = "Español";
}
        
System.out.println("La materia con menor calificación es: " + materiaMenorCalificacion);
}
}