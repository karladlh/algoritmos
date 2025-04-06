import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Ingresar numero positivo
        do {
            System.out.print("Ingresa un numero entero positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Por favor, ingresa un numero mayor a 0.");
            }
        } while (numero <= 0);

        // Imprimir numeros impares del 1 hasta el numero ingresado
        int i = 1;
        System.out.println("Numeros impares desde 1 hasta " + numero + ":");

        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);

        scanner.close();
    }
}


