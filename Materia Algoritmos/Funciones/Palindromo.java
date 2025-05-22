import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario ingresar una cadena
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        boolean esPalindromo = esPalindromo(texto);

        // Llama a la funcion para verificar si es palindromo
        if (esPalindromo) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        scanner.close();
    }

    // Funcion para verificar si una cadena es un palindromo
    public static boolean esPalindromo(String cadena) {
        // Paso 1: Convertir a minusculas
        String procesada = cadena.toLowerCase();

        // Paso 2: Eliminar espacios
        procesada = procesada.replace(" ", "");

        // Invertir la cadena 
        String invertida = "";
        for (int i = procesada.length() - 1; i >= 0; i--) {
            invertida += procesada.charAt(i);
        }

        // Compara la original procesada con la invertida
        return procesada.equals(invertida);
    }
}