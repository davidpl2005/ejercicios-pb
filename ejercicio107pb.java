// 107. Programa que de acuerdo al dato de la edad, indicado por el usuario, determine
// si una persona es mayor o menor de edad, incluir una verificación para que solo se acepten valores entre 1 y 100.

import java.util.Scanner;

public class ejercicio107pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int edad;

do{
        
System.out.print("Digite su edad: ");
edad = scanner.nextInt();

if (edad<1 || edad>100) {
System.out.println("Edad invalida.");
}
        
}while(edad < 1 || edad > 100);
        
scanner.close();

if(edad < 18){
System.out.println("Usted es menor de edad.");
        
}else{            
System.out.println(" Usted es mayor de edad.");
        }
    }
}
