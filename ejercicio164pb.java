import java.util.*;

public class ejercicio164pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int totalBoletos = 0;
        
double ventaBruta = 0;
        
int boletosAdulto = 0;
        
int boletosNino = 0;
        
int boletosPromocion = 0;
        
for (int i = 1; i <= 10; i++) {
            
System.out.println("Venta #" + i);
            
System.out.println("Tipos de boleto: Adulto=$60, Niño=$30, Promociones=$20");
            
System.out.print("Tipo de boleto vendido (Adulto, Niño, Promoción): ");
String tipoBoleto = scanner.next();
            
System.out.print("Cantidad de boletos vendidos: ");
int cantidadBoletos = scanner.nextInt();
            
totalBoletos += cantidadBoletos;
            
switch (tipoBoleto.toLowerCase()) {
                
case "adulto":
ventaBruta += cantidadBoletos * 60;
boletosAdulto += cantidadBoletos;
break;
                
case "niño":
ventaBruta += cantidadBoletos * 30;
boletosNino += cantidadBoletos;
break;

case "promoción":
ventaBruta += cantidadBoletos * 20;
boletosPromocion += cantidadBoletos;
break;
                
default:
System.out.println("Tipo de boleto no válido.");
}
}
System.out.println("Resumen de ventas:");
System.out.println("Total de boletos vendidos: " + totalBoletos);
System.out.println("Venta bruta: $" + ventaBruta);
System.out.println("Ventas por tipo de boleto:");
System.out.println("Adulto: " + boletosAdulto + " boletos");
System.out.println("Niño: " + boletosNino + " boletos");
System.out.println("Promoción: " + boletosPromocion + " boletos");
scanner.close();
    }
}
