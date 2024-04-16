// 103. Desarrolle un programa que solicite ingrese tres números distintos e indique de
// manera visual en la pantalla cuál de ellos es el número menor ingresado.

import java.util.Scanner;

public class ejercicio103pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

System.out.print("Digite un numero: ");
int n1 = scanner.nextInt();

System.out.print("Digite otro numero: ");
int n2 = scanner.nextInt();
        
System.out.print("Digite otro numero mas: ");
int n3 = scanner.nextInt();
        
scanner.close();

if(n1 < n2 && n1 < n3){
System.out.println(n1+ " es el número menor de los ingresados.");

}else if(n2<n1 &&n2<n3){
System.out.println(n2 + " es el número menor de los ingresados.");
        
}else{
System.out.println(n3 + " es el número menor de los ingresados.");
        }
    }
}