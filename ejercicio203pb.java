import java.util.Scanner;

public class ejercicio203pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite su edad: ");
int edad = scanner.nextInt();
scanner.close();
        
int pulsasiones = (220-edad)/10;
        
System.out.println("El numero de pulsasiones por cada 10 segundos: "+pulsasiones);
    }
}