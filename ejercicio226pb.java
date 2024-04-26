import java.util.Scanner;

public class ejercicio226pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite la altura: ");
int altura = scanner.nextInt();
scanner.close();
        
for(int i=altura;i>=1;i--){
            
for (int j = i; j >= 1; j--) {
 
 scanner.close();
    
System.out.print("* ");
}
System.out.println();
        }
    }
}
