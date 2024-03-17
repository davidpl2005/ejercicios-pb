// 72.A un trabajador le pagan según sus horas trabajadas y la tarifa está a un valor por
// hora. Si la cantidad de horas trabajadas es mayor a 40 horas, la tarifa por hora se
// incrementa en un 50% para las horas extras. Calcular el salario del trabajador
// dadas las horas trabajadas y la tarifa.
import java.util.Scanner;
public class ejercicio72pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);

int tarifa,horas;
int horas_Extra, tarifa_Aumentada;
        
System.out.print("Digite la tarifa por hora: ");
tarifa = scanner.nextInt();
        
System.out.print("Digite las horas trabajadas: ");
horas = scanner.nextInt();
scanner.close();
        
if(horas>40){
            
horas_Extra = horas -40;
tarifa_Aumentada = tarifa +(tarifa/2);
            
System.out.println("Salario del empleado con las horas extras trabajadas es de : "+((40*tarifa)+(horas_Extra*tarifa_Aumentada))+"$");
        
} else{
System.out.println("Salario del empleado sin horas extras es: "+(tarifa*horas)+"$");
        }
    }
}