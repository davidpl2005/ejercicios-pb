// 77.Calcular los pagos mensuales de una hipoteca y el total a pagar. El programa debe
// solicitar el capital, el interés anual y el número de años y debe escribir la cuota a
// pagar mensualmente. Para calcular la cuota se utiliza la siguiente fórmula: sea C el
// capital del préstamo, R la tasa de interés mensual y N el número de pagos. La cuota mensual viene dada por
import java.util.Scanner;
public class ejercicio77pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
Double c, r, n,cuota,p; 
        
System.out.print("Digite el capital: ");
c = scanner.nextDouble();
        
System.out.print("Digite la tasa de interes: ");
r = scanner.nextDouble();
        
System.out.print("Digite el numero de pagos: ");
n = scanner.nextDouble();
        
scanner.close();
        
p= Math.pow(1/(1+r), n);

cuota=(r*c)/(1-p);
System.out.println("Cuota mesual: "+cuota);
    }
}