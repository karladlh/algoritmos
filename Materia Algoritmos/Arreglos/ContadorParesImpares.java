//Array Guarda 10 numeros y cuenta numeros pares/impares, ejercicio 1
import java.util.Scanner; // Importamos la clase Scanner para leer entrada del teclado

public class ContadorParesImpares {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Creamos un array de tamaño 10 para almacenar los numeros enteros
        int[] numeros = new int[10];
        
        // Variables para contar los numeros pares e impares
        int contadorPares = 0;
        int contadorImpares = 0;
        
        System.out.println("Ingresa 10 numeros enteros:");
        
        // Bucle para leer los 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": "); // Mostramos el numero actual que se está pidiendo
            numeros[i] = scanner.nextInt(); // Leemos el numero ingresado y lo guardamos en el array
            
            // Verificamos si el numero es par o impar, realiza division entre dos y valida el residuo
            if (numeros[i] % 2 == 0) {
                //++ Significa contadorPares = contadorPares + 1; 
                contadorPares++; // Si es par, incrementamos el contador de pares
            } else {
                contadorImpares++; // Si es impar, incrementamos el contador de impares
            }
        }
        
        // Cerramos el scanner ya que no lo necesitamos más
        scanner.close();
        
        // Mostramos los resultados
        System.out.println("Resultados:");
        System.out.println("Numeros pares: " + contadorPares);
        System.out.println("Numeros impares: " + contadorImpares);
    }
}