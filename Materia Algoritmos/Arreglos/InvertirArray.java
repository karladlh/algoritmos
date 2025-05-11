//Guardar 6 Valores en un Array e Invertir Orden, Ejercicio 4
import java.util.Scanner; // Importar la clase Scanner para leer entrada

public class InvertirArray {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crear un array de tamaño 6 para almacenar los numeros
        int[] numeros = new int[6];
        
        // Pedir al usuario que ingrese los 6 numeros
        System.out.println("Ingresa 6 numeros enteros");
        
        // Bucle para leer y almacenar los 6 numeros en el array
        for (int i = 0; i < 6; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Guardar cada numero en el array
        }
        
        // Cerrar el Scanner
        scanner.close();
        
        // Invertir el orden de los elementos en el array
        for (int i = 0; i < 3; i++) { // Solo necesitamos recorrer la mitad del array
            // Intercambiar el elemento en posicion i con el elemento en posicion (5 - i)
            int temp = numeros[i]; // Guardar temporalmente el valor actual
            numeros[i] = numeros[5 - i]; // Mover el elemento del final al principio
            numeros[5 - i] = temp; // Mover el elemento guardado al final
        }
        
        // Mostrar el array invertido
        System.out.println("Array invertido:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numeros[i] + " "); // Imprimir cada numero seguido de espacio
        }
    }
}