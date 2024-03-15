// 70.Hacer un programa que calcule el resultado de la siguiente expresión: 1-2+3-4+5-6...n
import java.util.Scanner;
public class ejercicio70pb {
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

int numero;
int resultado = 0;

System.out.println("Dijite un numero:");
numero = scanner.nextInt();

scanner.close();

for (int i=0; i < numero; i++ ){
if(i % 2 == 0){
    resultado -=1;
}else{
    resultado+=i;
}
}

System.out.println("resultado: " + resultado);
}   
}
