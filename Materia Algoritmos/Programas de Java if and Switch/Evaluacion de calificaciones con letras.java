import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa calificacion: ");
        
        int calificacion = scanner.nextInt();
        String letra;
        //Divido la calificacion entre 10 para obtener los case que se usan en switch (10,9,8...)
        calificacion = calificacion / 10; 
        switch (calificacion) {
            case 10: //
                letra = "A";
                break;
            case 9:  
                letra = "A";
                break;
            case 8:  // Para el rango 80-89
                letra = "B";
                break;
            case 7:  // Para el rango 70-79
                letra = "C";
                break;
            case 6:  // Para el rango 60-69
                letra = "D";
                break;
            default: // Para el rango menor a 60
                letra = "F";
                break;
        }
        System.out.println("La calificacion es: " + letra);
        scanner.close();
    }
}