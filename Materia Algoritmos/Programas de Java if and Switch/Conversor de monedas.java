import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa cantidad en pesos mexicanos (MXN): ");
        //Leemos Cantidad de pesos Mexicanos, usamos double para poder guardar decimales
        double pesos = scanner.nextDouble();
        System.out.println("Selecciona la moneda a la que deseas convertir:");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dolar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dolar Canadiense (CAD)");
        System.out.println("9. Bolivar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.println("Escoge una opcion: ");
        
        //Leemos El Valor, como es un numero entero usamos Int
        int opcion = scanner.nextInt();
        //Aqui guardamos el valor final despues de convertirlo
        double cantidadConvertida;

        switch (opcion) {
            case 1: // Dolar (USD)
                cantidadConvertida = pesos * 0.05; 
                System.out.println("Cantidad en USD: " + cantidadConvertida);
                break;
            case 2: // Euro (EUR)
                cantidadConvertida = pesos * 0.045;
                System.out.println("Cantidad en EUR: " + cantidadConvertida);
                break;
            case 3: // Bath (THB)
                cantidadConvertida = pesos * 1.70; 
                System.out.println("Cantidad en THB: " + cantidadConvertida);
                break;
            case 4: // Yen (JPY)
                cantidadConvertida = pesos * 7.15; 
                System.out.println("Cantidad en JPY: " + cantidadConvertida);
                break;
            case 5: // Won (KRW)
                cantidadConvertida = pesos * 71.20; 
                System.out.println("Cantidad en KRW: " + cantidadConvertida);
                break;
            case 6: // Dolar Australiano (AUD)
                cantidadConvertida = pesos * 0.081; 
                System.out.println("Cantidad en AUD: " + cantidadConvertida);
                break;
            case 7: // Sol (PEN)
                cantidadConvertida = pesos * 0.18; 
                System.out.println("Cantidad en PEN: " + cantidadConvertida);
                break;
            case 8: // Dolar Canadiense (CAD)
                cantidadConvertida = pesos * 0.070; 
                System.out.println("Cantidad en CAD: " + cantidadConvertida);
                break;
            case 9: // Bolivar (VES)
                cantidadConvertida = pesos * 3.45; 
                System.out.println("Cantidad en VES: " + cantidadConvertida);
                break;
            case 10: // Peso Argentino (ARS)
                cantidadConvertida = pesos * 54; 
                System.out.println("Cantidad en ARS: " + cantidadConvertida);
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }
        //Se cierra el scanner por buena practica
        scanner.close();
    }
}