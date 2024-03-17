// 79.Permite determinar el voltaje de tres bombillos en kilovoltio, considerando que el
// bombillo trabaja con 120 V. calcular y visualizar el voltaje.
public class ejercicio79pb {
public static void main(String[] args) {
        
int voltaje = 120; 
int bombillos = 3;
double kilovoltios = (voltaje * bombillos) / 1000.0;
        
System.out.println("El voltaje total de los " + bombillos + " bombillos es: " + kilovoltios + " kilovoltios.");
    }
}
