//59.Realice un programa que solicite de la entrada estándar un entero del 1 al 10 y
// muestre en la salida estándar su tabla de multiplicar.
import java.util.Scanner;
public class ejercicio59pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int numero;

System.out.println(" Por favor ingrese un entre 1 Y 10 ");
numero = scanner.nextInt();

if (numero < 1 ) {
System.out.println("Por favor ingrese un numero valido entre 1 y 10. ");
System.out.println(" Por favor ingrese un entre 1 Y 10 ");
numero = scanner.nextInt();

}if (numero > 10) {
System.out.println("Por favor ingrese un numero valido entre 1 y 10. ");
System.out.println(" Por favor ingrese un entre 1 Y 10 ");
numero = scanner.nextInt();     
}

System.out.println(" La tabla de multiplicar del numero:" + numero + " es:\n");
for (int i=0; i <= 10; i++){
int resultado = numero * i;
System.out.println(numero + " x " + i + " = " + resultado);
}



}
}