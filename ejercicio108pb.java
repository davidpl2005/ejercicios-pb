// 108. Programa que determine si un número dado por el usuario es par o impar.

import java.util.Scanner;

public class ejercicio108pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

System.out.print("Digite un numero: ");
int numero = scanner.nextInt();

scanner.close();

if(numero % 2==0){
System.out.println(numero + " es par.");

}else{
System.out.println(numero + " es impar.");
        }
    }
}
