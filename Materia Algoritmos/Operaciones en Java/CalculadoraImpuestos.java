import java.util.Scanner;

public class CalculadoraImpuestos{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa salario Bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Ingresa porcentaje de Impuestos: ");
        double impuestosPorcentaje = scanner.nextDouble();
        System.out.print("Ingresa otras deducciones: ");
        double otrasdeducciones = scanner.nextDouble();
        
        double deduccionDeImpuestos = salarioBruto * (impuestosPorcentaje / 100);
        double salarioFinal = salarioBruto - deduccionDeImpuestos - otrasdeducciones;
        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Deducciones De Impuestos: " + deduccionDeImpuestos);
        System.out.println("Salario Neto Con Otras Deducciones: " + salarioFinal);
     }
}