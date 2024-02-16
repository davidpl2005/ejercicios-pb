import java.util.Scanner;
public class ejercicio4pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
double  radio, area; 

System.out.println(" Ingrese el radio del circulo: ");
radio = scanner.nextDouble();

area = Math.PI * radio * radio;

System.out.println(" El area del circulo con radio de: " + radio + " cm" + " es: " + area + " 4cm");
scanner.close();
   }
} 

