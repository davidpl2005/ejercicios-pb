//60.Realice un programa que lea de la entrada estándar números hasta que se introduzca un cero. 
// En ese momento el programa debe terminar y mostrar en la
// salida estándar el número de valores mayores que cero leídos.
import java.util.Scanner;
public class ejercicio60pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int contador = 0;
int numero;
        
while (true) {
            
System.out.print("Ingrese cualquier número o ingrese el numero 0 para terminar: ");
numero = scanner.nextInt();
            
if (numero == 0) {
break;
}

if (numero > 0) {
contador++;
    }
}
System.out.println(" Los número ingresados mayores que cero son: " + contador + " numeros");
scanner.close();
    }
}

