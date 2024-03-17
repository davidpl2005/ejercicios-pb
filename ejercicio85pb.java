// 85.Desarrolle el código fuente de un programa que permita ingresar un número y visualizar si es par o impar.
import java.util.Scanner;
public class ejercicio85pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.println("### PAR O IMPAR ###");

int numero;
        
System.out.print("Digite un numero: ");
numero = scanner.nextInt();
scanner.close();
        
if(numero % 2 ==0){
System.out.println(numero + " es par.");
        
}else{
System.out.println(numero + " es impar.");
        }
    }
}
