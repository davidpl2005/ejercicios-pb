// 47.Que escriba el porcentaje descontado en una compra, introduciendo la cantidad
// comprada, el precio (valor) de la compra y el precio (valor) pagado.
import java.util.Scanner;
public class ejercicio47pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

double cantidad_Comprada, precio_Compra,precio_Pagado;
double porcentajeDescuento;
        
System.out.print("Ingrese la cantidad comprada: ");
cantidad_Comprada = scanner.nextDouble();
        
System.out.print("Ingrese el precio de la compra: ");
precio_Compra = scanner.nextDouble();
        
System.out.print("Ingrese el precio pagado: ");
precio_Pagado = scanner.nextDouble();
        
porcentajeDescuento = calcularPorcentajeDescuento(cantidad_Comprada, precio_Compra, precio_Pagado);
        
System.out.println("El porcentaje descontado es: " + Math.abs(porcentajeDescuento) + "%");
        
scanner.close();
}
public static double calcularPorcentajeDescuento(double cantidadComprada, double precioCompra, double precioPagado) {
double monto_Descontado = precioCompra - precioPagado;
double porcentaje_Descuento = (monto_Descontado / precioCompra) * 100;
return porcentaje_Descuento;
    }
}