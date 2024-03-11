// 52.Crear una función que reciba como parámetro un número entero y escriba la tabla
// de multiplicar de ese número (por ejemplo: para el 3 deberá llegar desde 3x0=0 hasta 3x10=30

import java.util.Scanner;
public class ejercicio52pb {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int numero;

System.out.println(" Ingrese un numero para realizar la tabla de multiplicar:");
numero = scanner.nextInt();
scanner.close();

Tabla_Multiplicar(numero);
  }
public static void Tabla_Multiplicar(int numero) {
System.out.println("Tabla de multiplicar del " + numero + ":");
for (int i = 0; i <= 10; i++) {
int resultado = numero * i;
System.out.println(numero + " x " + i + " = " + resultado);
      }
  }
}
