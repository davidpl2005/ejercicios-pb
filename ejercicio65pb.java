// 65.Escriba un programa que calcule el valor de: 1+2+3+...+n
import java.util.Scanner;
public class ejercicio65pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int acumulador = 0;
int n;    

System.out.println(" por favor ingrese un numero:");
n = scanner.nextInt();

for(int i=1; i <=n; i++){
acumulador+=i;
}
System.out.println(" La suma de los numeros del 1 hasta " + n + " es: " + acumulador);
scanner.close();
}
}
