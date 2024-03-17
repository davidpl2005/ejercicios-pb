// 83.Desarrolle el código fuente de un programa que permita ingresar tres números,
// obtener su promedio y visualizar “APROBADO”, si su promedio es mayor a 7, caso
// contrario visualizará “MEJORE LA NOTA”.
import java.util.Scanner;
public class ejercicio83pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

double nota1, nota2, nota3;
double promedio;


System.out.println(" Por favor dijite la primera nota");
nota1 = scanner.nextDouble();

System.out.println(" Por favor dijite la segunda nota:");
nota2 = scanner.nextDouble();

System.out.println(" Por favor dijite la tercera nota:");
nota3 = scanner.nextDouble();

promedio = (nota1 + nota2 + nota3) / 3;

if(promedio > 7){
System.out.println(" Las notas ingresadas son: " + nota1 + ", " + nota2 + " y " + nota3 );
System.out.println(" El promedio obtenido es: " + promedio + " usted esta APROBADO.");
}else{
System.out.println(" Las notas ingresadas son: " + nota1 + ", " + nota2 + " y " + nota3 );
System.out.println(" El promedio obtenido es: " + promedio + " usted tiene que mejorar sus notas.");
}

scanner.close();
}
}