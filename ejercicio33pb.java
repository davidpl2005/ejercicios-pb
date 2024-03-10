// 33.Una empresa almacena los datos de N empleados, para esto, en un proceso
// repetitivo se ingresa el sexo y el salario de cada empleado. Se pide calcular:
// a) La cantidad de personas que ganan más de 700 al mes.
// b) El promedio de salarios.
// c) El porcentaje de mujeres que trabajan en esa empresa
// d) El porcentaje de varones que trabajan en esa empresa
import java.util.Scanner;
public class ejercicio33pb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorMayor700 = 0;
        double sumaSalarios = 0;
        int totalMujeres = 0;
        int totalEmpleados = 0;
        double promedioSalarios, porcentaje_mujeres, porcentaje_hombres, salario;
        
        System.out.print("Ingrese el número de empleados: ");
        int empleados = scanner.nextInt();
        
        for (int i = 0; i < empleados; i++) {
            System.out.print("Ingrese el sexo del empleado (M para masculino, F para femenino): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Ingrese el salario del empleado: ");
            salario = scanner.nextDouble();
            
            if (salario > 700) {
                contadorMayor700++;
            }
            sumaSalarios += salario;
            
            if (sexo == 'F' || sexo == 'f') {
                totalMujeres++;
            }
            totalEmpleados++;
        }
        promedioSalarios = sumaSalarios / totalEmpleados;
        porcentaje_mujeres = ((double)totalMujeres / totalEmpleados) * 100;
        porcentaje_hombres = 100 - porcentaje_mujeres;

        System.out.println("La suma de los salarios de todos los empleados es: " + sumaSalarios);
        System.out.println("Cantidad de personas que ganan más de 700 al mes: " + contadorMayor700 + " empleados");
        System.out.println("Promedio de salarios: " + promedioSalarios);
        System.out.println("Porcentaje de mujeres que trabajan en la empresa: " + porcentaje_mujeres + "%");
        System.out.println("Porcentaje de varones que trabajan en la empresa: " + porcentaje_hombres + "%");
        scanner.close();
    }
}
