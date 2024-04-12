// 93.Desarrolle el código fuente de un tiempo ingresado en minutos, visualizarlo por pantalla en horas, minutos y segundos.
import java.util.Scanner;

public class ejercicio93pb {
public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);
        
System.out.print("Digite una cantidad de tiempo expresada en minutos: ");
double minIngresados=in.nextDouble();
in.close();
        
int segundos = (int)(minIngresados*60);
        
int hrs= (int)(minIngresados/60)%60;
        
System.out.println("Horas: "+hrs+"\nMinutos: "+minIngresados+"\nSegundos: "+segundos);
    }
}