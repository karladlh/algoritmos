import java.time.LocalDate;
import java.util.Scanner;

public class ConversionDeFechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario una fecha con el formato YYYY-MM-DD
        System.out.print("Ingresa una fecha con el formato YYYY-MM-DD: ");
        String entrada = scanner.nextLine();

        // Convierte la cadena ingresada a fecha
        LocalDate fecha = LocalDate.parse(entrada);

        // Calcula la fecha una semana despues
        LocalDate unaSemanaDespues = fecha.plusDays(7);

        // Calcula la fecha un mes antes
        LocalDate unMesAntes = fecha.minusMonths(1);

        // Muestra las fechas
        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Una semana despues: " + unaSemanaDespues);
        System.out.println("Un mes antes: " + unMesAntes);

        scanner.close();
    }
}