// 26.Realizar el diagrama de flujo para que nos calcule el cuadrado de la hipotenusa de
// un triángulo rectángulo, a partir de la longitud de sus dos catetos.
import java.util.Scanner;
public class ejercicio26pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double cateto_adyacente, cateto_opuesto, hipotenusa_al_cuadrado, longitud_hipotenusa;

System.out.println(" Por favor ingrese la longitud del cateto opuesto:");
cateto_opuesto = scanner.nextDouble();

System.out.println(" Por favor ingrese la longitud del cateto adyacente");
cateto_adyacente = scanner.nextDouble();

hipotenusa_al_cuadrado = (cateto_opuesto*cateto_opuesto) + (cateto_adyacente*cateto_adyacente);

longitud_hipotenusa = Math.sqrt(hipotenusa_al_cuadrado);

System.out.println(" El cuadrado de la hipotenusa es: " + hipotenusa_al_cuadrado + " cm^2" +"\n"+ " y la longitud de la hipotenusa es: " + longitud_hipotenusa + " cm");
scanner.close();
}
    
}
