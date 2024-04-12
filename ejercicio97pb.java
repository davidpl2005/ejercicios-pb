// 97.Determinar la eficiencia energética de la Termoeléctrica Manta, considerando su
// consumo general en 10000 Kw. Si su consumo ingresado está entre el 80% y 100%
// kw visualizar “CONSUMO MEDIO”, caso contrario sea superior al 100% visualizar “ALTO CONSUMO DEENERGÍA”.

import java.util.Scanner;

public class ejercicio97pb{
public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);
        
System.out.print("Digite el consumo energetico: ");
int consumo=in.nextInt();
        
in.close();
        
int consumoGeneral=10000;

if(consumo>=(consumoGeneral*0.80) && consumo<=consumoGeneral){
System.out.println("CONSUMO MEDIO");
        
}else if(consumo>consumoGeneral){
System.out.println("ALTO CONSUMO DE ENERGÍA");
        
} else{
System.out.println("CONSUMO POR DEBAJO DE MEDIO");
        }
    }
}