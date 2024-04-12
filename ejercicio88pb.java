// 88.Desarrolle un programa que solicite ingrese tres voltajes distintos e indique si el
// promedio de los voltajes ingresados es menor a 115 visualice “VOLTAJE
// CORRECTO”, caso contrario sea mayor A 115 y menor a 220 visualice “ALTO
// VOLTAJE”, y si es mayor a 220 visualice “PELIGRO”.

import java.util.Scanner;
public class ejercicio88pb {
public static void main(String[] args) {
       
Scanner in = new Scanner(System.in);
int suma=0;
        
for(int i=1;i<=3;i++){
            
System.out.print("Digite el voltaje #"+i+": ");
int voltaje=in.nextInt();
            
suma=suma+voltaje;
}
in.close();
        
if(suma/3 <115){
System.out.println("VOLTAJE CORRECTO.");
        
}else if(suma/3>=115 && suma/3<220){
System.out.println("VOLTAJE ALTO.");
        
}else{
System.out.println("PELIGRO.");
    }
}
}