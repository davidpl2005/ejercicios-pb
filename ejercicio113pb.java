// 113. Programa que calcule el costo estimado de gasolina para viajar a la ciudad de
// Monterrey (distancia=500km) para uno de los 3 transportes siguientes a elegir:
// 1) Motocicleta
// 2) Automóvil
// 3) Pickup .
// Tomando en cuenta que cada vehículo tiene un rendimiento de : Motocicleta = 20km/lt , Auto = 10km/lt , Pickup = 5km/lt .
// Como resultado debe mostrar el gasto total de gasolina.


import java.util.Scanner;

public class ejercicio113pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int distancia = 500;
        
System.out.println("Opciones\n1. Motocicleta\n2. Automóvil\n3. Pickup");
        
System.out.print("Digite el número del transporte: ");
int numero = scanner.nextInt();
scanner.close();
        
switch (numero) {
            
case 1:
System.out.println("En motocicleta tendría un gasto de "+distancia/20+" lt de gasolina para viajar a Monterrey");
break;
                
case 2:
System.out.println("En automovil tendría un gasto de "+distancia/10+" lt de gasolina para viajar a Monterrey");
break;
                
case 3:
System.out.println("En pickup1 tendría un gasto de "+distancia/5+" lt de gasolina para viajar a Monterrey");
break;
            
default:
break;
}
}
}