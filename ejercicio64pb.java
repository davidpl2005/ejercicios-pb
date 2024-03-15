//64.Escriba un programa que calcule x^y, donde tanto x como y son enteros positivos, sin utilizar la función pow().
import java.util.Scanner;
public class ejercicio64pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

int x, y;    

System.out.print("Ingrese el valor de x: ");
x = scanner.nextInt();

System.out.print("Ingrese el valor de y: ");
y = scanner.nextInt();

if (x < 0 || y < 0) {
System.out.println("Los valores de x e y deben ser enteros positivos.");

} else {
            
int resultado = 1;
for (int i = 0; i < y; i++) {
resultado *= x;
}

System.out.println("El resultado de " + x + "^" + y + " es: " + resultado);
scanner.close();  
}

    }
}


