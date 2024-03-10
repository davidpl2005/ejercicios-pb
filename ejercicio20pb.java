// 20.Introducir 5 notas por teclado, obtener la suma de las notas, el promedio de las
//mismas y el doble de las notas.
import java.util.Scanner;
public class ejercicio20pb {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
double n1, n2, n3, n4, n5, suma, promedio;
double doble_n1, doble_n2, doble_n3, doble_n4, doble_n5;

System.out.println(" por favor ingrese la primera nota:");
n1 = scanner.nextDouble();

System.out.println(" por favor ingrese la segunda nota:");
n2 = scanner.nextDouble();

System.out.println(" por favor ingrese la tercera nota:");
n3 = scanner.nextDouble();

System.out.println(" por favor ingrese la cuarta nota:");
n4 = scanner.nextDouble();

System.out.println(" por favor ingrese la quinta nota:");
n5 = scanner.nextDouble();

suma = n1 + n2 + n3 + n4 + n5;

promedio = (n1+ n2 + n3 + n4 + n5)/5;

doble_n1 = n1*2;
doble_n2 = n2*2;
doble_n3 = n3*2;
doble_n4 = n4*2;
doble_n5 = n5*2;

System.out.println(" La suma de las notas ingresadas es: " + suma +"\n");
System.out.println(" El promedio de las notas ingresadas es: " + promedio + "\n");
System.out.println(" la primera nota es: " + n1 + " y el doble es: " + doble_n1 + "\n" + " La segunda nota es: " + n2 + " y el doble es: " + doble_n2 );
System.out.println(" la tercer nota es: " + n3 + " y el doble es: " + doble_n3 + "\n" + " La cuarta nota es: " + n4 + " y el doble es: " + doble_n4 );
System.out.println(" la quinta nota es: " + n5 + " y el doble es: " + doble_n5);
scanner.close();
}  
}