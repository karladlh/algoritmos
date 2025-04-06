import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Aqui se guardara la suma de todos los valores, 
        double suma = 0;
        //Cantidad de Valores Ingresados
        int cantidad = 0;
        //Aqui guardaremos el resultado final (El Promedio)
        double numero;
        
        System.out.println("Calculadora de media de numeros positivos");
        System.out.println("Ingrese numeros positivos (ingrese un negativo para terminar):");
        
        
        //El Ciclo se repetira infinitamente (Porque True siempre se cumple) y romperemos el ciclo desde adentro
        while (true) {
            System.out.print("Ingrese un numero: ");
            //Guardamos El Valor que ingrese el usuario
            numero = scanner.nextDouble();
            
            if (numero < 0) {
                //Break se usa para romper el ciclo en el que estamos
                break; // Salir del ciclo si el número es negativo
            }
            
            //Sumamos el Nuevo Valor a la Cuenta que ya tenemos
            suma += numero;
            //Cuantos Valores ha ingresado el usuario
            //Igual a sumar 1
            cantidad++;
        }
        
        //Validamos que el usario haya ingresado más de un valor
        if (cantidad > 0) {
            //Obtenemos la media
            double media = suma / cantidad;
            System.out.println("Numeros Ingresados: " + cantidad);
            System.out.println("La media de todos los numeros es: " + media);
        } else {
            System.out.println("No se ingresaron numeros positivos.");
        }
        
        scanner.close();
    }
}