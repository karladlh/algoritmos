import java.util.Scanner;

public class Main{

     public static void main(String []args){
        //Se usa para leer lo que ingresa el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una palabra ");
        //Leemos la Palabra y la Guardamos en una variable, La variable es una String (Cadena de Letras)
        String palabraParaContar = scanner.nextLine();
        int contadordeAs = 0;
        
        
        //Este ciclo va a revisar cada caracter de la palabra
        //La variable i es un contador
        //La palabra length me dice cuantos caracteres tiene la palabra, para usarla en el ciclo for
        // i++ es sumar 1 al valor actual
        for(int i = 0; i < palabraParaContar.length(); i++)
        {
            //En la palabra, cada caracter tiene una posicion diferente
            //con charAt vamos a cada posicion para ver que valor tiene el caracter (Empezamos desde 0)
           char c = palabraParaContar.charAt(i);
           //Comparamos el caracter de la palabra contra nuestra 'a' , Se usan comillas simples porque es un caracter
           if(c == 'a'){
            //Contamos las 'a'
            contadordeAs++;
           }
        }
        System.out.println("La letra 'a' se repitio el siguiente numero de veces: " + contadordeAs);

     }
}