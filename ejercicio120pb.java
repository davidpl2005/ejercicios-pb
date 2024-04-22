// 120. Programa que mande a imprimir el texto “Hola usuario!” , y que pregunte al
// usuario si desea que siga imprimiendo el texto [S/N]? . De acuerdo a la respuesta
// del usuario [S ó N], el saludo siga imprimiendo ó se detenga .

import java.util.*;

public class ejercicio120pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
String respuesta = "S";
        
System.out.println("Hola usuario!");
        
while (respuesta.equalsIgnoreCase("S")) {
            
System.out.print("¿Desea que siga imprimiendo el saludo? [S/N]: ");
            
respuesta = scanner.nextLine();
            
if (respuesta.equalsIgnoreCase("S")) {
System.out.println("Hola usuario!");
}
}

scanner.close();
System.out.println("Programa finalizado.");
}
}