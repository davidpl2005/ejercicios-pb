import java.util.*;

public class ejercicio151pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingrese una cadena de caracteres: ");
String cadena = scanner.nextLine();
scanner.close();
        
if(cadena.length()>10){
System.out.println(cadena);
        
}else{
System.out.println("-");
        }
    }
}
