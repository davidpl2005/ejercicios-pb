import java.util.Scanner;

public class ejercicio137pb {
public static void main(String[] args){
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite el valor de a: ");
double a = scanner.nextDouble();
        
System.out.print("Digite el valor de b: ");
double b = scanner.nextDouble();
        
System.out.print("Digite el valor de c: ");
double c = scanner.nextDouble();
scanner.close();
        
double x1= (-b+Math.sqrt((b*b)-4*a*c))/ 2*a;
        
double x2= (-b-Math.sqrt((b*b)-4*a*c))/ 2*a;
        
System.out.println("X1 = "+x1);
        
System.out.println("X2 = "+x2);
    }
}
