//Importamos el scanner
import java.util.*;
public class VerificarEdad{

     public static void VerificarEdad(String []args){
        //Usaremos el Scanner
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad: ");
        //Leemos edad
        edad = scanner.nextInt();
        
        //boolean es un valor que guarda Verdadero/Falso (True o False)
        boolean puedeVotar = PuedeVotar(edad);
        
        if(puedeVotar){
            System.out.println("Es elegible para votar");
        } else {
            System.out.println("No es elegible para votar");
        }
        
        // Cerramos el Scanner
        scanner.close();
        
     }
     
     //La Funcion devuelve un boolean, recibe un numero (La Edad)
     public static boolean PuedeVotar(int edad){
        if(edad >= 18){
            //Regresa Valor Verdadero
            return true;
       } else {
           //Regresa Valor Falso
            return false;
        } 
     }
}