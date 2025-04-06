import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 1;
        
        // Esto nos ayudara a validar que El Usuario Ingresara un numero Positivo
        do {
            System.out.println("Ingrese un numero entero positivo: ");
            numero = scanner.nextInt();
            
            if (numero <= 0) {
                System.out.println("El número debe ser positivo. Intente nuevamente.");
            }
        } while (numero <= 0);
        
        //Usamos el signo "+" para unir textos
        System.out.println("Cuadrados de los numeros desde 1 hasta " + numero + ":");
        
        // Mostrar cuadrados usando do-while
        do {
            //Sacamos el Cuadrado
            int cuadrado = contador * contador;
            //Imprimos el Numero 
            System.out.println("Cuadrado del numero " + contador + " es " + cuadrado);
            contador++;
            //El Ciclo Termina cuando el Contador llega al numero ingresado por el usuario
        } while (contador <= numero);
        
        //Cerrar Scanner, Buena Practica
        scanner.close();
    }
}