import java.util.Scanner;
public class ejercicio9pb{
public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    double cantidad, valor_iva, cantidad_total;
    double iva = 0.15; //0.15 = que tener 15 % en el iva //

    System.out.println(" Por favor ingrese una cantidad: ");
    cantidad = scanner.nextDouble();

    valor_iva = cantidad * iva;
    cantidad_total = cantidad * iva + cantidad;

    System.out.println(" El valor del iva del 15 % de la cantidad que ingreso es de: " + valor_iva +"$"+ " el valor total aplicado el iva es de: " + cantidad_total + "$");

    scanner.close();

    }

}