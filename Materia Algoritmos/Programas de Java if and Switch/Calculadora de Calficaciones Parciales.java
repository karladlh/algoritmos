import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Permite usar un scanner para pedir valores al usuario
        Scanner scanner = new Scanner(System.in);

        // Guardamos Variables, double te permite guarda valores con punto decimal
        double parciales;
        double proyecto;
        double examenFinal;

        // Este bloque se repite hasta que el usuario escriba una calificación válida para los parciales (entre 0 y 100)
        do {
            // Mostramos un mensaje pidiendo la calificación de los parciales
            System.out.println("Introduce la calificacion de Parciales: ");
            // Guardamos el número que el usuario escriba en la variable 'parciales'
            parciales = scanner.nextDouble();
        } while (parciales < 0 || parciales > 100); // Si la calificación es menor que 0 o mayor que 100, se repite

        // Repetimos el mismo proceso, pero ahora para la calificación del proyecto
        do {
            System.out.println("Introduce la calificacion de Proyecto: ");
            proyecto = scanner.nextDouble();
        } while (proyecto < 0 || proyecto > 100); // Solo aceptamos valores entre 0 y 100

        // Pedimos la calificación del examen final
        do {
            System.out.println("Introduce la calificacion de Examen Final: ");
            examenFinal = scanner.nextDouble();
        } while (examenFinal < 0 || examenFinal > 100); // Validamos que esté en el rango permitido

        // Calcular la calificación final del alumno

        // Creamos una variable para guardar la calificación final, comenzando desde 0
        double calificacionFinal = 0;

        // Sumamos el 40% de la calificación de los parciales
        calificacionFinal = calificacionFinal + (parciales * 0.4);

        // Sumamos el 30% de la calificación del proyecto
        calificacionFinal = calificacionFinal + (proyecto * 0.3);

        // Sumamos el 30% de la calificación del examen final
        calificacionFinal = calificacionFinal + (examenFinal * 0.3);

        // Mostramos el resultado final en pantalla
        System.out.println("Calificacion Final: " + calificacionFinal);

        // Cerramos el scanner para liberar recursos.
        scanner.close();
    }
}