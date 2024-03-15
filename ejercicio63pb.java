// 63.Escriba un programa que lea valores enteros hasta que se introduzca un valor en el
// rango (20-30] o se introduzca el valor 0. El programa debe entregar la suma de los valores mayores a 0 introducidos
import java.util.Scanner;
public class ejercicio63pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int suma = 0;
int valor;       
    
while (true) {

System.out.print(" Ingrese un valor entero (termina si ingresa el 0, o un valor entre 20 y 30): ");
valor = scanner.nextInt();
        
if (valor == 0 || (valor > 20 && valor <= 30)) {
break;
 }
            
if (valor > 0) {
suma += valor;
    }
}
System.out.println("La suma de los valores mayores a 0 es: " + suma);
scanner.close();
    }
}
