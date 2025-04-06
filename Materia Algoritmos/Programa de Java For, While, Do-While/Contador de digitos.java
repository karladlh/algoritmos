import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un numero entero
        System.out.print("Ingresa un numero entero: ");
        int numero = scanner.nextInt();

        // Convertimos el numero a positivo para contar los digitos
        numero = Math.abs(numero);

        // Contador de digitos
        int contador = 0;

        // Caso especial: si el numero es 0
        if (numero == 0) {
            contador = 1;
        } else {
            while (numero > 0) {
                numero /= 10;
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El numero tiene " + contador + " digito(s).");

        scanner.close();
    }
}
