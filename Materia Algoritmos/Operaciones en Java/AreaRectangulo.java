import java.util.Scanner;

public class AreaRectangulo{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el largo: ");
        double largo = scanner.nextDouble();
        System.out.print("Ingresa el ancho: ");
        double ancho = scanner.nextDouble();
        
        double area = largo * ancho;
        System.out.print("El Area es: " + area);
     }
}