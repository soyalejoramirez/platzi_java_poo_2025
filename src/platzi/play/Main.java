package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("PLATZI PLAY 🍿");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "El señor de los anillos";
        pelicula.anioEstreno = 2001;
        pelicula.genero = "Fantasía";
        pelicula.calificar(4.7);

        Usuario usuario = new Usuario();
        usuario.nombre = "Juan";

        usuario.ver(pelicula);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Cual es tu nombre?");
//        String nombre = scanner.nextLine();
//
//        System.out.println("Hola " + nombre + ", esto es Platzi Play!");
//
//        System.out.println(nombre + " cuantos años tienes?");
//        int edad = scanner.nextInt();
//
//        System.out.println(nombre + " puedes ver contenido +" + edad);
    }
}
