//Suma de Elementos de Un Array, Ejercicio 2
import java.util.Scanner; // Importamos Scanner para leer entrada del teclado

public class SumaNumeros {
    public static void main(String[] args) {
        // Creamos el Scanner para leer entrada
        Scanner scanner = new Scanner(System.in);
        
        // Array para guardar los 5 numeros
        int[] numeros = new int[5];
        
        // Pedimos al usuario que ingrese los numeros
        System.out.println("Ingresa 5 numeros enteros:");
        
        // Bucle para leer los 5 numeros y guardarlos en el array
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Guardamos cada numero en el array
        }
        
        // Cerramos el Scanner
        scanner.close();
        
        // Variable para la suma
        int suma = 0;
        
        // Bucle para sumar todos los numeros del array
        for (int i = 0; i < 5; i++) {
            suma = suma + numeros[i]; // Sumamos cada elemento del array
        }
        
        // Mostramos el resultado
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}