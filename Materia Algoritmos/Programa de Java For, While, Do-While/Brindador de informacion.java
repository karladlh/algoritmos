import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Menu
        System.out.println("Ingresa el nombre de un cantante");
        System.out.println("Opciones Disponibles:");
        System.out.println("-Michael Jackson");
        System.out.println("-Freddie Mercury");
        System.out.println("-Shakira");
        System.out.println("-Beyonce");
        System.out.println("Ingresa el nombre de un cantante: ");
        //Podeos Guardar un Texto en vez de numero, toLowerCase se usa para cambiar todo a minuscula y poder hacer las comparaciones en el switch.
        String eleccion = scanner.nextLine().toLowerCase();
        //Aqui Guardamos el mensaje del artista
        String info;

        switch (eleccion) {
            case "michael jackson":
                info = "Michael Jackson fue un cantante, compositor y bailarín estadounidense, conocido como el 'Rey del Pop'.";
                break;
            case "madonna":
                info = "Madonna es una cantante, compositora y actriz estadounidense, considerada la 'Reina del Pop'.";
                break;
            case "freddie mercury":
                info = "Freddie Mercury fue el vocalista principal de la banda britanica Queen, conocido por su poderosa voz y presencia escenica.";
                break;
            case "shakira":
                info = "Shakira es una cantante colombiana conocida por su estilo musical que combina pop y ritmos latinos.";
                break;
            case "beyonce":
                info = "Beyonce es una cantante, compositora y actriz estadounidense, reconocida por su talento vocal y su influencia en la cultura pop.";
                break;
            //Lo que mostraremos al usuario si pregunta por un autor no disponible o escribe mal el nombre
            default:
                info = "No tengo informacion sobre ese cantante.";
                break;
        }

        System.out.println(info);
        //Cerramos, buena practica
        scanner.close();
    }
}