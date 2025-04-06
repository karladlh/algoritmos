import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el precio original al usuario
        System.out.print("Ingresa el precio: ");
        double precio = scanner.nextDouble();

        double descuento = 0;

        // Determinar el porcentaje de descuento
        if (precio <= 100) {
            descuento = 0;
        } else if (precio <= 200) {
            descuento = 0.10;
        } else if (precio <= 500) {
            descuento = 0.20;
        } else {
            descuento = 0.25;
        }

        // Calcular el monto del descuento y el precio final
        double valorDescuento = precio * descuento;
        double precioFinal = precio - valorDescuento;

        // Mostrar resultados
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Valor del descuento: " + valorDescuento);
        System.out.println("Precio final: " + precioFinal);

        scanner.close();
    }
}
