//38.Una persona por cada año de vida debe consumir 8 kilogramos de fruta. Dada la
// edad de una persona, imprimir cuántos gramos de fruta ha consumido y
// adicionalmente si una manzana pesa en promedio 4 gramos, determinar cuántas manzanas ha consumido.
import java.util.Scanner;
public class ejercicio38pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
int kilogramos_año = 8;
int edad, total_gramos, total_manzanas;

System.out.println(" Por favor ingrese su edad:");
edad = scanner.nextInt();

total_gramos = kilogramos_año*edad*1000;
total_manzanas = total_gramos/4;

System.out.println(" Su edad es: " + edad + " años y a consumido un total de: " + total_gramos + " gramos de fruta en lo que lleva de vida ");
System.out.println(" Y ha consumido un total de: " + total_manzanas + " manzanas en su vida.");
scanner.close();
}
}
