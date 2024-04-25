import java.util.*;

public class ejercicio141pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite un número: ");
int numero = scanner.nextInt();
        
int raizCuadrada = calcularRaizCuadrada(numero);
        
System.out.println("La raíz cuadrada de " + numero + " es aproximadamente: " + raizCuadrada);
scanner.close();
}
    
public static int calcularRaizCuadrada(int num) {
        
int estimacionInicial = num / 2;
int raiz = 0;
        
while (estimacionInicial != raiz) {
raiz = estimacionInicial;
estimacionInicial = (num / estimacionInicial + estimacionInicial) / 2;
}
return raiz;
    }
}
