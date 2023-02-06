package biblioteca;

import java.util.ArrayList;

public class Visor {

	public static void mostrarLibros(ArrayList<Libro> libros) {
	//	GestorBBDD g = new GestorBBDD();
	//	g.getLibros();
		for (Libro libro: libros) {
			System.out.println(libro);
		}
	}

	public static void mostrarLibro(Libro libro) {
		System.out.println(libro);
	}

	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
}
