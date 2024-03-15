//  61.Ejercicio 3: Realice un programa que calcule y muestre en la salida estándar la
// suma de los cuadrados de los 10 primeros enteros mayores que cero.
public class ejercicio61pb{
public static void main(String[]args){

int sumaCuadrados = 0;
            
for (int i = 1; i <= 10; i++) {
sumaCuadrados += i * i;
}

for (int j=1; j<=10; j++){
System.out.println(" Los numeros son:" + (j) ); 
}
       
System.out.println("La suma de los cuadrados de los 10 primeros enteros mayores que cero es: " + sumaCuadrados);
        }
    }
    
