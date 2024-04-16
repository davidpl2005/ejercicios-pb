//110. Programa que escriba en pantalla un comentario con respecto a la temperatura
// del día. Tomando en cuenta que Mucho Frío ( 0-10) , Frío (11-18) , Templado (19-25), Calor(26-40).

import java.util.Scanner;

public class ejercicio110pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite la temperatura: ");
double temperatura = scanner.nextDouble();

scanner.close();

if(temperatura <=10){
System.out.println("Hace mucho frío.");

}else if(temperatura > 10 && temperatura <=18){
System.out.println("Hace frío.");

}else if(temperatura > 18 && temperatura <=25){  
System.out.println("Está templado.");

}else{
System.out.println("Hace calor.");
        }
    }
}