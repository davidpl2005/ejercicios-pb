import java.util.*;

public class ejercicio198pb {
    
static int[][] tablero = new int[9][9];
public static void main(String[] args) {
        
generarSudokuAleatorio();
mostrarTablero();
        
Scanner scanner = new Scanner(System.in);
        
while (true) {
            
System.out.print("Ingresa la fila (0-8), la columna (0-8) y el número a ingresar (1-9) separados por espacios (Ejemplo: 0 0 5): ");

int fila = scanner.nextInt();
int columna = scanner.nextInt();
int numero = scanner.nextInt();
scanner.close();
          
if (validarMovimiento(fila, columna, numero)) {
tablero[fila][columna] = numero;
mostrarTablero();
            
} else {
System.out.println("Movimiento inválido. Inténtalo de nuevo.");
}
}
}
static void generarSudokuAleatorio() {
}
    
static void mostrarTablero() {
        
for (int i = 0; i < 9; i++) {
            
for (int j = 0; j < 9; j++) {
                
System.out.print(tablero[i][j] + " ");
}
System.out.println();
}
}
static boolean validarMovimiento(int fila, int columna, int numero) {
return true;
    }

}
