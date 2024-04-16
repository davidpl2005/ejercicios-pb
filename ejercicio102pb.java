// 102. A un trabajador eléctrico le pagan según sus horas trabajadas y la tarifa está a
// un valor determinado por hora. Si la cantidad de horas trabajadas es mayor a 40
// horas, la tarifa por hora se incrementa en un 25% para las horas extras. Calcular el
// salario del trabajador dadas las horas trabajadas y la tarifa de horas extras.

import java.util.Scanner;

public class ejercicio102pb {
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        
System.out.print("Digite la tarifa por hora: ");
double tarifa = scanner.nextInt();
        
System.out.print("Digite las horas trabajadas: ");
int horas = scanner.nextInt();
scanner.close();
        
if(horas>40){
int horasExtra = horas-40;
            
double tarifaHrsExtra=tarifa+tarifa*0.25;
            
System.out.println("Salario: $"+40*tarifa);
            
System.out.println("Salario horas extra: $"+horasExtra*tarifaHrsExtra);
            
System.out.println("Salario total: $"+(40*tarifa+horasExtra*tarifaHrsExtra));
        
}else{
System.out.println("Salario: $"+horas*tarifa);
        }
    }
}