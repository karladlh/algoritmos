import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar la cantidad de numeros
        System.out.print("¿Cuantos numeros quieres ingresar? ");
        int cantidad = scanner.nextInt();

        // Variables 
        int mayoresACero = 0;
        int menoresACero = 0;
        int igualesACero = 0;

        // 2. Leer los números uno por uno
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            int numero = scanner.nextInt();

            // 3. Clasificar el numero
            if (numero > 0) {
                mayoresACero++;
            } else if (numero < 0) {
                menoresACero++;
            } else {
                igualesACero++;
            }
        }

        // 4. Imprimir resultados
        System.out.println("\nResumen:");
        System.out.println("Numeros mayores que 0: " + mayoresACero);
        System.out.println("Numeros menores que 0: " + menoresACero);
        System.out.println("Numeros iguales a 0: " + igualesACero);

        scanner.close();
    }
}