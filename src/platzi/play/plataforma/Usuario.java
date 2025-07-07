package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

public class Usuario {
    public String nombre;
    public String email;

    public void ver(Pelicula pelicula) {
        System.out.println(nombre + " está viendo...");
        pelicula.reproducir();
    }
}
