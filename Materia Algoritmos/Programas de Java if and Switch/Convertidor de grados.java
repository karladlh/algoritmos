import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ingresar temperatura en grados Celsius
        System.out.print("Temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // 2. Mostrar el menú
        System.out.println("Seleccionar conversion:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.print("Opcion: ");
        int opcion = scanner.nextInt();

        
        switch (opcion) {
            case 1:
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("La temperatura en Fahrenheit es: " + fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.printf("La temperatura en Kelvin es: " + kelvin);
                break;
            default:
                System.out.println("Opcion no valida. Por favor, elige 1 o 2.");
        }

        scanner.close();
    }
}