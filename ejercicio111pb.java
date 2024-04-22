// 111. Programa que pida un número de día y lo muestre en formato de texto, ejemplo: 1=Domingo, 2=Lunes… 7=Sábado .

import java.util.Scanner;

public class ejercicio111pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite el numero de un dia de la semana: ");
int diaSemana = scanner.nextInt();
        
scanner.close();
        
switch (diaSemana) {
            
case 1:
System.out.println("El numero ingresado corresponde al dia Domingo");
break;
            
case 2:
System.out.println("El numero ingresado corresponde al dia Lunes");
break;
            
case 3:
System.out.println("El numero ingresado corresponde al dia Martes");
break;
            
case 4:
System.out.println("El numero ingresado corresponde al dia Miercoles");
break;
            
case 5:
System.out.println("El numero ingresado corresponde al dia Jueves");
break;
            
case 6:
System.out.println("El numero ingresado corresponde al dia Viernes");
break;
            
case 7:
System.out.println("El numero ingresado corresponde al dia Sabado");
break;

default:
break;
        }
    }
}
