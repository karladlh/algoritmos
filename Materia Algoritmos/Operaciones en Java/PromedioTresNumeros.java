import java.util.Scanner;

public class PromedioTresNumeros{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa numero 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa numero 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingresa numero 3: ");
        double num3 = scanner.nextDouble();
        
        double promedio = (num1 + num2 + num3) / 3;
        System.out.print("El Promedio es: " + promedio);
     }
}