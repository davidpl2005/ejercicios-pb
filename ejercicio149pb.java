import java.util.Scanner;

public class ejercicio149pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
int nRandom =(int)(Math.random()*100);
int num=0;
        
System.out.println(nRandom);
        
do {
            
System.out.print("Digite un número: ");
num = scanner.nextInt();
            
if(num<nRandom){
System.out.println("Digitó un número menor.");
            
}else if(num>nRandom){
System.out.println("Digitó un número mayor");
            
}else{
System.out.println("Le atinó");
}
        
} while (nRandom!=num);
scanner.close();
    }
}
