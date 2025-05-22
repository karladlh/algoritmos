import java.util.Scanner;

public class ComparacionDeCadenas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la primer cadena de texto
        System.out.println("Ingresa la primera palabra:");
        String cadena1 = scanner.nextLine();
        
        // Solicitar la segunda cadena de texto
        System.out.println("Ingresa la segunda palabra:");
        String cadena2 = scanner.nextLine();
        
        // Comparar las longitudes de las cadenas
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las Cadenas tienen la misma longitud.");
        } else {
            System.out.println("Las Cadenas tienen diferente longitud.");
        }
        
        // Comparar el contenido de las cadenas (case sensitive)
        if (cadena1.equals(cadena2)) {
            System.out.println("Las Cadenas son iguales");
        } else {
            System.out.println("Las Cadenas son diferentes");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}