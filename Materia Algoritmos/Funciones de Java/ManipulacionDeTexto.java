import java.util.Scanner;

public class ManipulacionDeTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa un texto largo:");
        String texto = scanner.nextLine();
        
        // Convertir todo a minusculas para comparar sin importar minusculas o mayusculas.
        String textoMinusculas = texto.toLowerCase();
        String palabraBuscada = "ingenieria";
        
        int contador = 0;
        //Busca la Primer Coincidencia de la palabra
        int indice = textoMinusculas.indexOf(palabraBuscada);
        
        //Si no hay coincidencia, el indice es -1 y no hara nada
        while (indice != -1) {
            contador++;
            //Busca a partir de la coincidencia anterior, va "recortando" el texto
            indice = textoMinusculas.indexOf(palabraBuscada, indice + 1);
        }
        
        System.out.println("La palabra '" + palabraBuscada + "' aparece " + contador + " veces en el texto.");
        
        scanner.close();
    }
}