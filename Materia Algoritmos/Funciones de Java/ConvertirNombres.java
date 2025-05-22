import java.util.Scanner;

public class ConvertirNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        // Bucle que se repite hasta que el usuario escriba "salir"
        while (true) {
            System.out.print("Ingresa un nombre completo en minusculas (o escribe 'salir' para terminar): ");
            entrada = scanner.nextLine();

            // Verifica si el usuario quiere salir (sin importar mayusculas o minusculas)
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Programa finalizado.");
                //Rompe el Ciclo While
                break;
            }

            // Convierte el nombre a mayusculas
            String nombreEnMayusculas = entrada.toUpperCase();

            // Muestra el resultado
            System.out.println("Nombre en mayusculas: " + nombreEnMayusculas);
        }

        scanner.close();
    }
}