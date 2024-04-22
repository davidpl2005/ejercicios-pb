// 127. Programa que de acuerdo a la fecha dada por el usuario (día,mes,año)
// determine a qué estación del año pertenece (primavera, verano, otoño, invierno).

import java.time.LocalDate;
import java.util.*;

public class ejercicio127pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa el día: ");
int dia = scanner.nextInt();
        
System.out.print("Ingresa el mes: ");
int mes = scanner.nextInt();
        
System.out.print("Ingresa el año: ");
int año = scanner.nextInt();
        
LocalDate fecha = LocalDate.of(año, mes, dia);
        
String estacion = obtenerEstacion(fecha.getMonthValue());
        
System.out.println("La fecha " + dia + "/" + mes + "/" + año + " corresponde a la estación: " + estacion);
scanner.close();
}
    
public static String obtenerEstacion(int mes) {
String estacion;
        
switch (mes) {
case 3:
case 4:
case 5:
estacion = "Primavera";
break;
            
case 6:
case 7:
case 8:
estacion = "Verano";
break;
            
case 9:
case 10:
case 11:
estacion = "Otoño";
break;
            
case 12:
case 1:
case 2:
estacion = "Invierno";
break;
default:
                
estacion = "Mes no válido";
break;
}
return estacion;
}
}
