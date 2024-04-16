// 105. Desarrolle el código fuente de un programa que permita ingresar cuatro notas
// sobre 20 con decimales, obtener su promedio y visualizar “APROBADO”, si su
// promedio es mayor a 14.5; caso contrario su promedio sea menor a 14.5 y mayor a
// 10 visualizará “SUPLETORIO”. Si la nota promedio es menor a 10 mostrará “PERDIDO EL AÑO”.

import java.util.Scanner;

public class ejercicio105pb {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

double suma=0;

for(int i=1;i<5;i++){

System.out.print("Digite la nota #"+ i +": ");
double nota = scanner.nextDouble();

suma += nota;
}
scanner.close();

double promedio = suma/4;
 
if(promedio>=14.5){
System.out.println("APROBADO.");

}else if(promedio <  14.5 && promedio > 10){
System.out.println("SUPLETORIO.");
        
}else{
System.out.println("PERDIDO EL AÑO.");
        }
    }
}
