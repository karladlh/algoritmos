import java.util.*;

public class Main{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero de mes: ");
        int mes = scanner.nextInt();
        String estacion;

        switch (mes) {
            //Si escribo el case de esta manera, salta cada validacion hasta el final
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                //El Break Sirve para dividir cada condiciones, para que no salte a la siguiente condiciones
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otono";
                break;
            // El Default es lo que haremos si ninguna condicion se cumple
            default:
                estacion = "Mes no valido";
        }
            System.out.println("La estacion del anio es: " + estacion);
     }
}