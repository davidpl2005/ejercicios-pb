//49.Crear una función que devuelva la primera letra de una cadena de texto.
public class ejercicio49pb{
public static void main(String[] args){
    
String nombre = "isac";
char primeraLetra = obtenerPrimeraLetra(nombre);
    
System.out.println("La primera letra de " + nombre + " es: " + primeraLetra);
}  
public static char obtenerPrimeraLetra(String cadena) {
return cadena.charAt(0);
  }
  
}
