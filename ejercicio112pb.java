// Programa que muestre en pantalla el siguiente menú de opciones : Línea de autobuses ADO, seleccione su destino:
// a) Cartagena. [$150]
// b) Barranquilla. [$320]
// c) Sincelejo. [$120]
// d) Valledupar. [$90]
// e) Santa Marta.[$110]
// Tomando en cuenta el menú anterior, obtener la opción seleccionada por el usuario
// y muestre el mensaje según corresponda: Su destino es “Cartagena”, tiempo de traslado 2 hrs, costo $200.

import java.util.Scanner;

public class ejercicio112pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.println(" Línea de autobuses ADO ");
        
System.out.println("1. Cartagena $150\n2. Barranquilla $320\n3. Sincelejo $120\n4. Valledupar $90\n5. Santa Marta $110");
        
System.out.print("Digite la opción de su destino: ");
int opción = scanner.nextInt();
scanner.close();
        
switch (opción) {
            
case 1:
System.out.println("Su destino es Cartagena, tiempo de traslado 2 horas, costo $150.");
break;
                
case 2:
System.out.println("Su destino es Barranquilla, tiempo de traslado 4 horas, costo $320.");
break;
                
case 3:
System.out.println("Su destino es Sincelejo, tiempo de traslado 1 hora y 30 minutos, costo $120.");
break;
                
case 4:
System.out.println("Su destino es Valledupar, tiempo de traslado 1 hora y 20 minutos, costo $90.");
break;
                
case 5:
System.out.println("Su destino es Santa Marta, tiempo de traslado 1 hora y 40 minutos, costo $110.");
break;
            
default:
break;
    }
}
}





