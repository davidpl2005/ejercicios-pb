import java.util.Scanner;

public class ejercicio227pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
double precBocaJamon = 1.5, preRefresco = 1.05, precCerveza = 0.75;
        
System.out.print("Digite el número de unidades cosumidas de bocadillo de jamón: ");
int bocaJamon = scanner.nextInt();
        
System.out.print("Digite el número de unidades cosumidas de refresco: ");
int refresco = scanner.nextInt();
        
System.out.print("Digite el número de unidades cosumidas de cerveza: ");
int cerveza = scanner.nextInt();
scanner.close();
        
System.out.println("Bocadillo de jamón: "+(bocaJamon*precBocaJamon));
System.out.println("Resfresco: "+(refresco*preRefresco));
System.out.println("Cerveza: "+(cerveza*precCerveza));
double total = (bocaJamon*precBocaJamon)+(refresco*preRefresco)+(cerveza*precCerveza);
System.out.println("Total: "+total);
    }
}