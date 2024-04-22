// 124. Escribir un programa que muestre en pantalla todos los múltiplos de 3 de los
// números comprendidos del 1 al 3000.

public class ejercicio124pb {
public static void main(String[] args) {
        
System.out.println("Multiplos de 3 desde 1 hasta 3000");
        
for(int i=1;i<=3000;i++){
if(i%3==0){
                
System.out.print(i+" ");
            }
        }
    }
}