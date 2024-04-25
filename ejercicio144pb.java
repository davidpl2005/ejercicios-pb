public class ejercicio144pb {
public static void main(String[] args) {
        
int suma = 0;
        
long multiplicacion = 1;
        
for(int i=1;i<=100;i++){
if(i%2==0){
suma+=i;
            
}else{
multiplicacion*=i;
}
}
System.out.println("La suma de los números pares entre 1 y 100 es: " + suma);
System.out.println("La multiplicación de los números impares entre 1 y 100 es: " + multiplicacion);
    }
}