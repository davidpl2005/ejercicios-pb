// 100. Desarrollar un algoritmo que lea dos números, e indique si la suma de los dos
// números es par, caso contrario visualizar la suma es impar.

import java.util.Scanner;

public class ejercicio100pb {
public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);
        
System.out.print("Digite un numero: ");
int n1=in.nextInt();
        
System.out.print("Digite otro numero: ");
int n2=in.nextInt();
in.close();
        
int suma=n1+n2;
        
System.out.println(n1+" + "+n2+" = "+suma);
if(suma%2==0){
System.out.println("Es par");
        
}else{
System.out.println("Es impar");
        }
    }
}
