import java.util.*;

public class ejercicio152pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingresa una cadena de caracteres: ");
String cadena = scanner.nextLine();
scanner.close();
        
char[] arregloOriginal = cadena.toCharArray();
char[] arregloCopia = new char[arregloOriginal.length];
        
for (int i = 0; i < arregloOriginal.length; i++) {
arregloCopia[i] = arregloOriginal[i];
}
System.out.println("Contenido del arreglo original: " + new String(arregloOriginal));
System.out.println("Contenido del arreglo copia: " + new String(arregloCopia));
    }
}
