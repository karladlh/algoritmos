import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Usado para leer lo que el usuario ingresa
        Scanner scanner = new Scanner(System.in);
        //Nos ayuda a Crear numeros Aleatorios
        Random random = new Random();
        
        //Genera un numero aleatorio entre 0 y 99 (Son 100 Pero comienza desde 0), despues sumamos 1 para que sea 1-100
        int numeroAleatorio = random.nextInt(100) + 1;
        //Aqui Guardo lo que el usuario ingresa
        int intento = 0;

        
        System.out.println("Adivina el numero entre 1 y 100");
        
        //Esta Operacion se repetira mientras El numero que ingresa el usuario y el numero aleatorio sea diferente
        while (intento != numeroAleatorio) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();

            //Condicion si es demasiado bajo
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta otra vez.");
            } 
            //Revisamos esta condicion si no se cumple la primera
            else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta otra vez.");
            }
        }
        
        System.out.println("Atinaste al numero");
        scanner.close();
    }
}