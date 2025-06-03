import java.util.Scanner;

public class CalculadoraIMC{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingresa la altura en metros: ");
        double altura = scanner.nextDouble();
        
        double IMC = peso / (altura * altura);
        System.out.print("El IMC es: " + IMC);
     }
}