//101. Determinar si un número entero es divisible por otro e imprimir divisible, caso
// contrario visualizar no es divisible.

import java.util.Scanner;

public class ejercicio101pb {

public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite un numero: ");
int n1 = scanner.nextInt();
        
System.out.print("Digite otro numero: ");
int n2 = scanner.nextInt();
scanner.close();
        
if(n1%n2==0){
System.out.println(n1+" es divisible por "+n2);
        
}else{
System.out.println(n1+" no es divisible por "+n2);
        }
    }
}