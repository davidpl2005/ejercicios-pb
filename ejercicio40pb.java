// 40.Construir una calculadora minera, la cual permita saber a cuántos pesos equivalen
// los kilos de oro ingresados. El usuario deberá ingresar tanto los kilos a convertir como el precio 
// en pesos por onza de oro. Recordemos que una onza equivale a 28.3495 gramos y que 1000 gramos son un kilo.
import java.util.Scanner;
public class ejercicio40pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

double onza, kilos, precio, kilos_a_onzas, total_pagar;

System.out.println(" Por favor ingrese los kilos de oro a convertir:");
kilos = scanner.nextDouble();

System.out.println(" Por favor ingrese el precio por onza de oro:");
precio = scanner.nextDouble();

onza = 28.35;

kilos_a_onzas = kilos * onza;

total_pagar = kilos_a_onzas * precio;

System.out.println(" La cantidad de kilos de oro ingresados es: " + kilos + " kilos "+" y equivalen a: " + kilos_a_onzas + " onzas");
System.out.println(" El total a pagar por los kilos convertidos es: " + total_pagar + " pesos.");
}     
}
