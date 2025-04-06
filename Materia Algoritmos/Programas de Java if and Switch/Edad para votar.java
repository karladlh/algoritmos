// Importamos la clase Scanner, que nos sirve para leer lo que el usuario escribe por teclado
import java.util.*;

public class Main {
    public static void main(String[] args) {
  // Creamos un objeto llamado 'scanner' para poder leer datos del usuario (por ejemplo, calificaciones)
        Scanner scanner = new Scanner(System.in);
        double edad;
        System.out.println("Introduce tu edad: ");
        edad = scanner.nextDouble();

        if(edad >= 18){
            System.out.println("Es elegible para votar");
       } else {
            System.out.println("No es elegible para votar");
        }

    }
}