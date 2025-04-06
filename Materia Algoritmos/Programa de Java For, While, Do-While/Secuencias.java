import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingresa el primer numero de la secuencia: ");
        int primerNumero = scanner.nextInt();

        System.out.print("Ingresa la diferencia entre los numeros: ");
        int diferencia = scanner.nextInt();

        System.out.print("Ingresa el numero maximo hasta donde se generara la secuencia: ");
        int maximo = scanner.nextInt();

        // Inicializamos la variable para la secuencia
        int numeroActual = primerNumero;

        System.out.println("\nSecuencia aritmetica:");
        // Bucle do-while para generar la secuencia
        do {
            System.out.print(numeroActual + " ");
            numeroActual += diferencia;
        } while (numeroActual <= maximo);

        scanner.close();
    }
}
