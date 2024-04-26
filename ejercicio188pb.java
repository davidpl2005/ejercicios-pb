import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio188pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa una dirección de correo electrónico: ");
String correo = scanner.nextLine();
        
String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        
Pattern pattern = Pattern.compile(regex);
        
Matcher matcher = pattern.matcher(correo);
        
if (matcher.matches()) {
System.out.println("La dirección de correo electrónico es válida.");
        
} else {
System.out.println("La dirección de correo electrónico no es válida.");
}
scanner.close();
    }
}