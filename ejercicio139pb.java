import java.util.Scanner;

public class ejercicio139pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite un número: ");
int n = scanner.nextInt();
scanner.close();
        
int fac=1;
        
for(int i=2;i<=n;i++){
fac *= i;
        }
System.out.println(n +"! = "+ fac);
    }
}