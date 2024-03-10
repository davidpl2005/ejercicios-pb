//16.Algoritmo que determine si una persona gano o no un examen matemático
import java.util.Scanner;
public class ejercicio16pb {
 public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
Double nota;

System.out.println(" Por favor ingrese su nota del examen matematico: ");
nota = scanner.nextDouble();

if(nota > 5){
System.out.println(" Por favor ingrese una nota valida: \n");
System.out.println(" Por favor ingrese su nota del examen matematico: ");
nota = scanner.nextDouble();
}if(nota>=3){
System.out.println(" Su nota fue: " + nota + " y usted aprobo el examen matematico: ");
}else{
System.out.println(" Su nota fue: " + nota + " y usted reprobo el examen matematico: ");
}
scanner.close();
    }
    
}
