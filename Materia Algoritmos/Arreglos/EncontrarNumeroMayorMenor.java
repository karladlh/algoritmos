//Ingresar 8 numeros a un array y determinar cual numero es menor y cual mayor, ejercicio 3
import java.util.Scanner; // Importar Scanner para leer entrada

public class EncontrarNumeroMayorMenor {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer entrada
        Scanner scanner = new Scanner(System.in);
        
        // Crear array para 8 numeros enteros
        int[] numeros = new int[8];
        
        // Pedir al usuario que ingrese los numeros
        System.out.println("Ingresa 8 numeros enteros:");
        
        // Bucle para leer y almacenar los 8 numeros
        for (int i = 0; i < 8; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Guardar cada numero en el array
        }
        
        // Cerrar el Scanner
        scanner.close();
        
        // Asumir que el primer numero es tanto el mayor como el menor inicialmente
        int mayor = numeros[0];
        int menor = numeros[0];
        
        // Bucle para encontrar el mayor y menor numero
        for (int i = 1; i < 8; i++) {
            // Comparar para encontrar el mayor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            
            // Comparar para encontrar el menor
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Mostrar los resultados
        System.out.println("\nEl numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}