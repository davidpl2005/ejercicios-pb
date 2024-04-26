import java.util.Scanner;

public class ejercicio228pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
String codigo="1",contrseña="1234";
        
String codigoIn="",contraseñaIn="";
        
do {
System.out.print("Ingrese su codigo: ");
codigoIn = scanner.next();
            
System.out.print("Ingrese su contraseña: ");
contraseñaIn = scanner.next();
            
if(codigoIn!=codigo ){
System.out.println("CODIGO INCORRECTO.");
}
            
if(contraseñaIn!=contrseña){
System.out.println("CONTRASEÑA INCORRECTA.");
}
        
} while (codigoIn!=codigo && contraseñaIn!=contrseña);
scanner.close();
    }
}
