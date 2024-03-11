// 44.Realiza un programa que calcule las potencias de la 2 a la 10 del número PI y la
// raíz cuadrada de dicha potencia. Para ello construye una función que calcule la
// potencia n-ésima de un número cualquiera y utiliza después la función sqrt de la librería matemática de C.
public class ejercicio44pb {

public static double calcularPotencia(double base, int exponente) {
double resultado = 1.0;
for (int i = 0; i < exponente; i++) {
resultado *= base;
}
return resultado;
}
public static void main(String[] args) {

double pi = Math.PI;
for (int i = 2; i <= 10; i++) {

double potencia_pi = calcularPotencia(pi, i);
double raiz_cuadrada = Math.sqrt(potencia_pi);
            
System.out.println("Potencia de PI^" + i + ": " + potencia_pi);
System.out.println("Raíz cuadrada de la potencia: " + raiz_cuadrada + "\n");
        }
    }
}
