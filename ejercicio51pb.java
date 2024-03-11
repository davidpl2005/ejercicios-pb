// 51.Calcule el área y el perímetro de un rectángulo dada la base y la altura.
import java.util.Scanner;
public class ejercicio51pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int base, altura;
int area, perimetro;

System.out.println(" Por favor ingrese la base del rectangulo");
base = scanner.nextInt();

System.out.println(" Por favor ingrese la altura del rectangulo");
altura = scanner.nextInt();

area = base * altura;
perimetro = (base + altura) * 2;

System.out.println(" La base del rectangulo es: " + base);
System.out.println(" La altura del rectangulo es: " + altura);
System.out.println(" El area del rectangulo es: " + area);
System.out.println(" El perimetro del rectangulo es: " + perimetro);
scanner.close();
}
}