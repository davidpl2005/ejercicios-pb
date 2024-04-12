// 96.Crear un programa que lea una frase y a continuación visualice cada palabra de la
// frase una debajo de otra, seguida cada palabra del número de letras que componen cada palabra.

import java.util.Scanner;

public class ejercicio96pb {
public static void main(String[] args) {
            
Scanner in = new Scanner(System.in);
            
System.out.print("Ingresa una frase: ");
String frase = in.nextLine();
in.close();
            
String[] palabras = frase.split(" ");
            
System.out.println("Palabras y número de letras:");
            
for (String palabra : palabras) {
System.out.print(palabra+": ");
                
System.out.println(palabra.length());
            }
        }
    }

