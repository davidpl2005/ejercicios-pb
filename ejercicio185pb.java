import java.util.*;

public class ejercicio185pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Ingrese su apellido paterno: ");
String apellidoPaterno = scanner.nextLine();
        
System.out.print("Ingrese su apellido materno: ");
String apellidoMaterno = scanner.nextLine();
        
System.out.print("Ingrese su nombre(s): ");
String nombres = scanner.nextLine();
        
System.out.print("Ingrese su fecha de nacimiento (formato AAAAMMDD): ");
String fechaNacimiento = scanner.nextLine();
        
System.out.print("Ingrese su sexo (F/M): ");
char sexo = scanner.next().charAt(0);
        
System.out.print("Ingrese las dos letras correspondientes a la entidad de nacimiento (ej. DF): ");
String entidadNacimiento = scanner.next();
        
char curpPrimeraLetraApellidoPaterno = obtenerPrimeraConsonanteInterna(apellidoPaterno);
        
char curpPrimeraLetraApellidoMaterno = obtenerPrimeraConsonanteInterna(apellidoMaterno);
        
char curpPrimeraLetraNombre = obtenerPrimeraConsonanteInterna(nombres);
        
String curp = curpPrimeraLetraApellidoPaterno + "" + curpPrimeraLetraApellidoMaterno + "" + curpPrimeraLetraNombre +
        
fechaNacimiento.substring(2, 4) + fechaNacimiento.substring(4, 6) + fechaNacimiento.substring(6, 8) +sexo + entidadNacimiento;
        
System.out.println("La CURP generada es: " + curp);
scanner.close();
    }
    public static char obtenerPrimeraConsonanteInterna(String palabra) {
        for (int i = 1; i < palabra.length() - 1; i++) {
            char letra = palabra.charAt(i);
            if (esConsonante(letra)) {
                return letra;
            }
        }
        return 'X';
    }
    public static boolean esConsonante(char letra) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(Character.toLowerCase(letra)) != -1;
    }
    
}