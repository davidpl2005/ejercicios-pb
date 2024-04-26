import java.util.Scanner;

public class ejercicio211pb {
public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        
    int precioBocadilloJamón = 15,precioBocadilloQueso = 10,precioPatatasFritas = 5,precioRefresco = 3,precioCerveza = 4;
        
    System.out.println("Ingrese el número de bocadillos de jamón consumidos:");
    int numBocadillosJamón = scanner.nextInt();
        
    System.out.println("Ingrese el número de bocadillos de queso consumidos:");
    int numBocadillosQueso = scanner.nextInt();
        
    System.out.println("Ingrese el número de porciones de patatas fritas consumidas:");
    int numPatatasFritas = scanner.nextInt();
        
    System.out.println("Ingrese el número de refrescos consumidos:");
    int numRefrescos = scanner.nextInt();
        
    System.out.println("Ingrese el número de cervezas consumidas:");
    int numCervezas = scanner.nextInt();
        
    scanner.close();
        
    int totalCuenta = (numBocadillosJamón * precioBocadilloJamón) + 
                          (numBocadillosQueso * precioBocadilloQueso) + 
                          (numPatatasFritas * precioPatatasFritas) + 
                          (numRefrescos * precioRefresco) + 
                          (numCervezas * precioCerveza);
        System.out.println("La cuenta total es: " + totalCuenta + " Bs.");
    }
}
