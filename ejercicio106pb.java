// 106. Crear un programa que encuentre el máximo común divisor de dos números usando el algoritmo de Euclides : 
// Dado dos números enteros positivos m y n, tal que m > n, para encontrar su máximo común divisor, es decir, el mayor entero
// positivo que divide a ambos:- Dividir m por n para obtener el resto r (0 = r < n) ;
// - Si r = 0, el MCD es n.;- Si no, el máximo común divisor es MCD(n,r).

import java.util.Scanner;

public class ejercicio106pb{
public static void main(String args[]){
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite el valor de m: ");
int m = scanner.nextInt();
        
System.out.print("Digite el valor de n: ");
int n = scanner.nextInt();
scanner.close();
        
int mcd = encontrarMCD(m, n);
        
System.out.println("El máximo común divisor de " + m + " y " + n + " es: " + mcd);
}
    
public static int encontrarMCD(int m, int n) {
        
int r = m % n;
        
if (r == 0) {
return n;
        
} else {
return encontrarMCD(n, r);
}
}
}
