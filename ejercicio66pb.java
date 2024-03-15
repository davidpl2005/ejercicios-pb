//  66.Escriba un programa que calcule el valor de: 1+3+5+...+2n-1
import java.util.Scanner;
public class ejercicio66pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int suma =0 ;
int numero;

System.out.println("Por favor ingrese un numero:");
numero = scanner.nextInt();
scanner.close();

for (int i=1; i <= ( 2 * numero) - 1; i+=2) {
suma +=i;   
}

System.out.println(" La suma de los numeros impares desde 1 hasta " + (2*numero-1) + " es: " + suma);
}    
}
