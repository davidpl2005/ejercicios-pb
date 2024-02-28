//24.Programa que de acuerdo a una cantidad de pulgadas ingresadas por teclado,
//realice la conversión a centímetros. (1plg=2.54cm).
import java.util.Scanner;
public class ejercicio24pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double  pulgadas_centimetros, centimetros, pulgadas ;

System.out.println(" Por favor ingrese la cantidad de pulgadas a convertir: ");
pulgadas = scanner.nextDouble();

pulgadas_centimetros = 2.54;

centimetros = pulgadas * pulgadas_centimetros;

System.out.println(" La cantidad de pulgadas ingresadas es: " + pulgadas +"\n" + " La conversion a centimetros es: " + centimetros + " cm");
scanner.close();
}
    
}
