import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.println("Ingresa letras (espacio para salir):");

        for (;;) {
            System.out.print("Letra: ");
            letra = scanner.next().toLowerCase().charAt(0);

            if (letra == ' ') {
                break;
            }

            if (esVocal(letra)) {
                System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
