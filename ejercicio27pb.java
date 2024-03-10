//27.Que el usuario de su género y su nombre, dependiendo de su género imprimir en
//pantalla Bienvenido “nombre”, Bienvenida “nombre”, y si en dado caso se pone otra opción imprimir en pantalla Hola indeciso 
import java.util.Scanner;
public class ejercicio27pb {

public static void main(String[]args){

Scanner scanner = new Scanner(System.in);

String nombre, genero;

System.out.println(" Por favor ingrese su nombre: ");
nombre = scanner.nextLine();

System.out.println(" Por favor ingrese su genero:" + " hombre / mujer / otro:");
genero = scanner.nextLine();

if (genero.equals("hombre") ){
System.out.println(" Bienvenido: " + nombre);

}if (genero.equals("mujer")){
System.out.println(" Bienvenida: " + nombre);

}if(genero.equals("otro")){
    System.out.println(" Hola indeciso: " + nombre);}

scanner.close();
}
}
