import java.util.Scanner;

public class ejercicio160pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite una cantidad de segundos: ");
int segundos = scanner.nextInt();
scanner.close();

System.out.println("Dias: "+(segundos/86400));
System.out.println("Horas: "+(segundos%86400)/3600);
System.out.println("Minutos: "+(segundos/60)%60);
    }
}
