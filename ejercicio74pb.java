//74.Algoritmo que dados tres números los muestre ordenados de mayor a menor
import java.util.Scanner;
public class ejercicio74pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

int numero1,numero2,numero3;

System.out.print("Digite un numero: ");
numero1 = scanner.nextInt();
        
System.out.print("Digite otro numero: ");
numero2 = scanner.nextInt();
        
System.out.print("Digite otro numero mas: ");
numero3 = scanner.nextInt();
scanner.close();
        
numerosDeMayoraMenor(numero1, numero2, numero3);
}
   
public static String numerosDeMayoraMenor(int n1 ,int n2 ,int n3){
String respuesta="";
        
if(n1>n2 && n2>n3 ){
respuesta=n1+" "+n2+" "+n3;

}else if(n1>n3 && n3>n2){
respuesta=n1+" "+n3+" "+n2;
        
}else if(n2>n1 && n1>n3){
respuesta=n2+" "+n1+" "+n3;
        
}else if(n2>n3 && n3>n1){
respuesta=n2+" "+n3+" "+n1;
        
}else if(n3>n1 && n1>n2){
respuesta=n3+" "+n1+" "+n2;

}else{
respuesta=n3+" "+n2+" "+n1;
}
System.out.println(respuesta);
return respuesta;
    }
}