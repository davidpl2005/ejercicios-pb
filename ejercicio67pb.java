// 67.Escriba un programa que calcule el valor de: 1*2*3*...-n (factorial)
import java.util.Scanner;
public class ejercicio67pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int numero;
int factorial = 1;

System.out.println(" Por favor ingrese un numero:");
numero = scanner.nextInt();

for(int i=1; i<=numero; i++){
factorial *=i;
}

System.out.println(" El numero ingresado es: " + numero + " y su factorial es: " + factorial);
scanner.close();
}  
}
