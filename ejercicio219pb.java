import java.util.Scanner;

public class ejercicio219pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite un número: ");
int n = scanner.nextInt();
scanner.close();
        
int suma=0;
        
for(int i=n;i<=n+10;i++){
if(i%2==0){
suma+=i;
    }
}
System.out.println("Suma de los 5 primeros números pares a partir de "+n+": "+suma);
    }
}