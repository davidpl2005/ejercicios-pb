// 119. Programa que pida al usuario una contraseña a el usuario, y muestre un
// mensaje de “contraseña incorrecta” ó “contraseña aceptada” según corresponda,
// colocando un contador de intentos, si excede 3 intentos deberá mostrar “Intentos
// excedidos” y finalice. La contraseña correcta será “passwd” .

import java.util.*;

public class ejercicio119pb{
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
String contraCorrecta = "passwd";
        
int intentos = 0;
        
while (intentos < 3) {
            
System.out.print("Ingresa la contraseña: ");
            
String contraIngresada = scanner.nextLine();
            
if (contraIngresada.equals(contraCorrecta)) {
                
System.out.println("Contraseña aceptada");
break;
            
} else {
System.out.println("Contraseña incorrecta");
intentos++;

}
} scanner.close();
if (intentos == 3) {
            
System.out.println("Intentos excedidos");
}
}
}