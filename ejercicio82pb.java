// 82.Desarrolle el código fuente de un programa que permita ingresar un número y
// visualizar si es positivo o negativo
import java.util.Scanner;
public class ejercicio82pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

int numero;
        
System.out.print("Digite un numero: ");
numero = scanner.nextInt();
scanner.close();
        
if(numero < 0){
System.out.println(numero + " es un número negativo.");
        
}else{
System.out.println(numero + " es un número positivo");
        }
    }
}
