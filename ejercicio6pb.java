import java.util.Scanner;
public class ejercicio6pb {
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);

    int num1, num2, num3, media;

    System.out.println(" Dijite el primer numero: ");
    num1 = scanner.nextInt();

    System.out.println(" Dijite el segundo numero: ");
    num2 = scanner.nextInt();

    System.out.println(" Dijite el tercer numero: ");
    num3 = scanner.nextInt();

    //para calcular la media aritmetica se suman el conjunto de numeros y se dividen entre la cantidad de numeros de hay// 
    media = (num1+ num2+ num3) /3;

    System.out.println(" la media aritmetica de los numeros: " + num1 + " , " + num2 + " y " + num3 + " es: " + media);
    scanner.close();
    }
}
