import java.util.Scanner;
public class ejercicio7pb {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int num;

System.out.println(" Dijite un numero: ");
num = scanner.nextInt();

if (num < 0) {
 System.out.print(" Su numero es negativo y es el numero: " + num);   
} else {
System.out.print(" Su numero es positivo y es el numero: " + num);  
}
  scanner.close(); 

} 
}

