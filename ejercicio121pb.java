//  121. Programa que pida 5 números al usuario y muestre en pantalla la suma total de todos ellos.

import java.util.Scanner;

public class ejercicio121pb{
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int suma=0;
        
for(int i=1;i<=5;i++){
            
System.out.print("Digite el numero "+i+": ");
int n = scanner.nextInt();
    
suma+=n;
}
scanner.close();
System.out.println("La suma de los numero ingresados es: "+suma);
    }
}