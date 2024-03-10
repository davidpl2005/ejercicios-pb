import java.util.Random;
import java.util.Scanner;

public class ejercicio23pb {

    private static final int NUM_DIGITOS = 3;
    private static final int MAX_VALOR_DIGITO = 9;
    private static final int MIN_VALOR_DIGITO = 0;

    private static int[] generarCombinacionSecreta() {
        int[] combinacion = new int[NUM_DIGITOS];
        Random random = new Random();
        for (int i = 0; i < NUM_DIGITOS; i++) {
            combinacion[i] = random.nextInt(MAX_VALOR_DIGITO - MIN_VALOR_DIGITO + 1) + MIN_VALOR_DIGITO;
            for (int j = 0; j < i; j++) {
                if (combinacion[i] == combinacion[j]) {
                    i--;
                    break;
                }
            }
        }
        return combinacion;
    }

    private static String evaluarIntento(int[] combinacionSecreta, int[] intento) {
        StringBuilder respuesta = new StringBuilder();
        for (int i = 0; i < NUM_DIGITOS; i++) {
            if (intento[i] == combinacionSecreta[i]) {
                respuesta.append("VERDE ");
            } else if (contieneDigito(combinacionSecreta, intento[i])) {
                respuesta.append("AMARILLO ");
            } else {
                respuesta.append("ROJO ");
            }
        }
        return respuesta.toString();
    }

    private static boolean contieneDigito(int[] numeros, int digito) {
        for (int numero : numeros) {
            if (numero == digito) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] combinacionSecreta = generarCombinacionSecreta();
        int intentos = 0;

        System.out.println("¡Bienvenido al juego del Rojo-amarillo-verde!");
        System.out.println("Intenta adivinar la combinación de tres dígitos en el menor número de intentos posibles.");
        System.out.println("Para cada intento, introduce tres dígitos separados por espacios.");

        while (true) {
            intentos++;

            System.out.println("Intento " + intentos + ": ");
            int[] intento = new int[NUM_DIGITOS];
            for (int i = 0; i < NUM_DIGITOS; i++) {
                intento[i] = scanner.nextInt();
            }

            String respuesta = evaluarIntento(combinacionSecreta, intento);
            System.out.println(respuesta);

            if (respuesta.equals("VERDE VERDE VERDE")) {
                System.out.println("¡Felicidades! Has adivinado la combinación en " + intentos + " intentos.");
                break;
            }
        }
    }
}
