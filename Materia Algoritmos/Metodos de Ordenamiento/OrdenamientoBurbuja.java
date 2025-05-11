import java.util.Scanner; // Necesario para leer entrada del usuario

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        // Crear objeto Scanner para leer entrada
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el tamaño del array
        System.out.print("Cuantos valores deseas ingresar? ");
        int tamano = scanner.nextInt();
        
        // Crear array con el tamaño especificado
        int[] numeros = new int[tamano];
        
        // Llenar el array con valores ingresados por el usuario
        System.out.println("Ingresa los " + tamano + " valores:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Cerrar el Scanner
        scanner.close();
        
        // Ordenar el array usando el método de burbuja
        for (int i = 0; i < tamano - 1; i++) {
            for (int j = 0; j < tamano - i - 1; j++) {
                // Comparar elementos adyacentes
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar elementos si están en orden incorrecto
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        
        // Mostrar el array ordenado
        System.out.println("\nArray ordenado de forma ascendente:");
        for (int i = 0; i < tamano; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}