import java.util.Scanner;
//17.Algoritmo que determine el número mayor de 2 leídos
public class ejercicio17pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int num1, num2;

System.out.println(" Por favor ingrese un numero:");
num1 = scanner.nextInt();
System.out.println(" Por favor ingrese el segundo numero:");
num2 = scanner.nextInt();

if (num1 > num2){
System.out.println(" El numero mayor es: " + num1 + " y el numero menor es: " + num2);
}else{
System.out.println(" El numero mayor es: " + num2 + " y el numero menor es: " + num1);
}
scanner.close();
}
}
