import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar número
        System.out.print("Ingresa un numero entero positivo: ");
        int numero = scanner.nextInt();

        // Confirmar si el número es negativo
        if (numero < 0) {
            System.out.println("El factorial no esta definido para numeros negativos.");
        } else {
        // Es long porque los factoriales crecen rapido
            long factorial = 1;

            // Calcular el factorial
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            // Mostrar el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}
