import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            mostrarMenu();
            int opcion = scanner.nextInt();

            System.out.print("Ingresa el primer numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo numero: ");
            double num2 = scanner.nextDouble();

            realizarOperacion(opcion, num1, num2);

            System.out.print("¿Deseas continuar? (s/n): ");
            continuar = scanner.next();
        }

        System.out.println("¡Gracias por usar la calculadora!");
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Calculadora ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Elige una opcion: ");
    }

    public static void realizarOperacion(int opcion, double a, double b) {
        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (a + b));
            case 2 -> System.out.println("Resultado: " + (a - b));
            case 3 -> System.out.println("Resultado: " + (a * b));
            case 4 -> {
                if (b != 0) System.out.println("Resultado: " + (a / b));
                else System.out.println("No se puede dividir entre 0.");
            }
            default -> System.out.println("Opcion invalida.");
        }
    }
}

